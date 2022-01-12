@java.lang.Override
public void teleopInit() {
    java.lang.System.out.println("Initiation teleop");
    if ((autonomousCommand) != null)
        autonomousCommand.cancel();
    
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().add(new org.usfirst.frc.team2854.robot.commands.Drive(org.usfirst.frc.team2854.robot.Robot.driveSystem, org.usfirst.frc.team2854.robot.Robot.oi.controller0.art, org.usfirst.frc.team2854.robot.Robot.oi.controller0.alt, org.usfirst.frc.team2854.robot.Robot.oi.controller0.arx));
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().add(new org.usfirst.frc.team2854.robot.commands.ClimbCommand(org.usfirst.frc.team2854.robot.Robot.climbSys, org.usfirst.frc.team2854.robot.Robot.oi.controller0.alx));
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().add(new org.usfirst.frc.team2854.robot.commands.GearCommand(org.usfirst.frc.team2854.robot.Robot.gearsys, org.usfirst.frc.team2854.robot.Robot.oi.controller1.bb));
}