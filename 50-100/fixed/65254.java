public java.lang.Boolean tryCloseDoor() {
    if (!(PistonOut)) {
        DoorOpener.set(false);
        DoorOpen = false;
        return true;
    }else {
        if (ManualOverride) {
            DoorOpener.set(true);
            DoorOpen = true;
            java.lang.System.out.println("Manually overriden.");
            return true;
        }else {
            java.lang.System.out.println("Cannot close door with piston extended.");
            return false;
        }
    }
}