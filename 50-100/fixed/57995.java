public double getGearPercentage(int gear) {
    if ((gear < 1) || (gear > (this.MAX_GEAR))) {
        if ((this.debugState) == (org.usfirst.frc.team339.HardwareInterfaces.transmission.Transmission.DebugState.DEBUG_MOTOR_DATA)) {
            java.lang.System.out.println("Invalid gear to set in getGearPercentage()");
        }
        return 0.0;
    }
    return this.gearPercentages[gear];
}