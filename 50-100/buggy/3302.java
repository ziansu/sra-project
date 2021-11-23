public void setPower(double power) {
    if ((power < (maxPower)) && (power > (minPower))) {
        this.power = power;
        RobotConstants.TALON_ARM_MOTOR.set(power);
    }else
        if (power < (minPower)) {
            this.power = -0.5;
        }else {
            this.power = 0.5;
        }
    
}