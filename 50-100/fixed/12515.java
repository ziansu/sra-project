@java.lang.Deprecated
@java.lang.Override
public void execute() {
    org.usfirst.frc.team1100.robot.subsystems.Drive.getInstance().driveMecanum(org.usfirst.frc.team1100.robot.OI.getInstance().getLeftStick().getX(), org.usfirst.frc.team1100.robot.OI.getInstance().getLeftStick().getY(), org.usfirst.frc.team1100.robot.OI.getInstance().getRightStick().getY());
}