public void teleopPeriodic() {
    org.usfirst.frc.team5519.robot.Robot.driveBase.Drive(OI.driveStick);
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    org.usfirst.frc.team5519.robot.Robot.cameraVision.sendImage();
}