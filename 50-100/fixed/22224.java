public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Left", org.usfirst.frc.team3507.robot.Robot.drivetrain.leftMaster.getSpeed());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Right", org.usfirst.frc.team3507.robot.Robot.drivetrain.rightMaster.getSpeed());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Flywheel Speed", org.usfirst.frc.team3507.robot.Robot.flywheel.getSpeed());
}