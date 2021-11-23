public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("encoder value right", RobotMap.encoderRight.get());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("encoder value left", RobotMap.encoderLeft.get());
}