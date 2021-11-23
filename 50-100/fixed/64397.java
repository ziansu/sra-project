private void updateSmartDashboard() {
    frontDistanceSensor.updateDashboard();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Gyro Angle", powertrainSubsystem.getGyroAngle());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Contour CenterX", visionProcessing.getLargestContourCenterX());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Aim Angle Offset", visionProcessing.getGoalDistanceFromCenterInDegrees());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Mean Encoder", powertrainSubsystem.getMeanEncoderDistance());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Left Encoder", powertrainSubsystem.getLeftEncoderDistance());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Right Encoder", powertrainSubsystem.getRightEncoderDistance());
}