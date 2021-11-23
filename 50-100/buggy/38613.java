protected void execute() {
    double x = org.usfirst.frc.team1245.robot.OI.deadZone(OI.driverJoystick.getX(), RobotMap.translationalDeadZone);
    double y = org.usfirst.frc.team1245.robot.OI.deadZone(OI.driverJoystick.getY(), RobotMap.rotationalDeadZone);
    double twist = org.usfirst.frc.team1245.robot.OI.deadZone(OI.driverJoystick.getTwist(), RobotMap.rotationalDeadZone);
    Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(x, y, twist, 0);
}