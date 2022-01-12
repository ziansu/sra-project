public void setPower(double power) {
    if ((power < (maxPower)) && (power > (minPower))) {
    }else
        if (power < (minPower)) {
            power = minPower;
        }else {
            power = maxPower;
        }
    
    RobotConstants.TALON_ARM_MOTOR.set(power);
    this.power = power;
}