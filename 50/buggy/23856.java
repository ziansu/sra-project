public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("ShotRPM", org.usfirst.frc4089.FRC2016Robot.Robot.spinShooter.getLeftRPMs());
    org.usfirst.frc4089.FRC2016Robot.Util.VisionProcessing.Process();
}