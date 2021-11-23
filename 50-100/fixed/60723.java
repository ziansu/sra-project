public void setupDrive() {
    left1.changeControlMode(TalonControlMode.PercentVbus);
    left1.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    left2.changeControlMode(TalonControlMode.PercentVbus);
    left3.changeControlMode(TalonControlMode.PercentVbus);
    right1.changeControlMode(TalonControlMode.PercentVbus);
    right1.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    right2.changeControlMode(TalonControlMode.PercentVbus);
    right3.changeControlMode(TalonControlMode.PercentVbus);
    gyro.reset();
    getPIDController().setSetpoint(0);
    getPIDController().enable();
    IAccumulator = 0;
    settledTimer.start();
}