@java.lang.Override
public void autonomousInit() {
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putBoolean("Robot.autonomousInit()", true);
    if ((autonomousCommand) != null)
        autonomousCommand.start();
    
    autonomousCommand = org.usfirst.frc.team4750.robot.Robot.autoswitch.getMode();
    autonomousCommand = chooser.getSelected();
}