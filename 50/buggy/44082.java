@java.lang.Override
public void autonomousPeriodic() {
    org.usfirst.frc.team4373.robot.DriveWithJoystick.getDriveWithJoystick().cancel();
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
}