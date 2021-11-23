@java.lang.Override
public void autonomousInit() {
    autonomousCommand = ((edu.wpi.first.wpilibj.command.Command) (autoChooser.getSelected()));
    autonomousCommand.start();
    org.usfirst.frc.team3274.robot.Robot.isTeleop = false;
}