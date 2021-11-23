@java.lang.Override
public void teleopInit() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().add(org.usfirst.frc.team4571.robot.Robot.TANK_DRIVE_COMMAND);
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().add(org.usfirst.frc.team4571.robot.Robot.INTAKE_COMMAND);
}