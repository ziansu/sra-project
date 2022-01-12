public void setLeftDrivePower(double power) {
    frontLeftMotor.changeControlMode(TalonControlMode.PercentVbus);
    frontLeftMotor.set((-power));
}