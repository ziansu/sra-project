public void setPower(double power) {
    this.power = power;
    if ((power < (maxPower)) && (power > (minPower))) {
        RobotConstants.TALON_ARM_MOTOR.set(power);
    }else
        if (power < (minPower)) {
            RobotConstants.TALON_ARM_MOTOR.set((-0.5));
        }else {
            RobotConstants.TALON_ARM_MOTOR.set(0.5);
        }
    
}