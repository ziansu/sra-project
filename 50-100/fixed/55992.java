protected void execute() {
    double leftJVX = org.usfirst.frc.team1100.robot.OI.getInstance().getLeftStick().getAxis(Joystick.AxisType.kX);
    double leftJVY = org.usfirst.frc.team1100.robot.OI.getInstance().getLeftStick().getAxis(Joystick.AxisType.kY);
    double rightJVY = org.usfirst.frc.team1100.robot.OI.getInstance().getLeftStick().getAxis(Joystick.AxisType.kY);
    org.usfirst.frc.team1100.robot.subsystems.Drive.getInstance().driveMecanum(leftJVX, leftJVY, rightJVY);
}