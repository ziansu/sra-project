public void driveJoystick(robot.PolarCoordinate p, double rotation, robot.subsystems.ChassisSubsystem.DriveMode driveMode, robot.subsystems.ChassisSubsystem.PIDEnable rotationPIDEnable, robot.subsystems.ChassisSubsystem.PIDEnable motorPIDEnable) {
    disableAnglePID();
    disableDistancePID();
    robot.PolarCoordinate drivePolarCoordinate = getDrivePolarCoordinate(p, driveMode);
    if (rotation != 0.0) {
        lastAngleSetpoint = -1.0;
    }
    drivePolar(drivePolarCoordinate, rotation, (-1), rotationPIDEnable, motorPIDEnable);
}