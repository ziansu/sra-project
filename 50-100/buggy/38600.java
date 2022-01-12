public int sense() {
    java.lang.System.out.println("Platform.sense called");
    com.gams.utility.Position position = getPosition();
    knowledge.set("position", 0);
    self.device.location.set(0, position.getX());
    self.device.location.set(1, position.getY());
    self.device.location.set(2, position.getZ());
    return Status.OK.value();
}