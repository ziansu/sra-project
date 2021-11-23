public double getSecondGearPercentage(int whichJoystick) {
    if (((whichJoystick == (org.usfirst.frc.team339.HardwareInterfaces.transmission.Transmission_old.WhichJoystick.LEFT_JOYSTICK)) || (whichJoystick == (org.usfirst.frc.team339.HardwareInterfaces.transmission.Transmission_old.WhichJoystick.RIGHT_JOYSTICK))) || (whichJoystick == (org.usfirst.frc.team339.HardwareInterfaces.transmission.Transmission_old.WhichJoystick.ONE_JOYSTICK)))
        return this.getSecondGearPercentage();
    else
        return this.leftSecondGearPercentage;
    
}