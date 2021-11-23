protected void execute() {
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putBoolean("Is MechDrive executing?", true);
    Robot.driveTrain.controllerDrive(Robot.oi.driveStick.getRawAxis(0), Robot.oi.driveStick.getRawAxis(3), Robot.oi.driveStick.getRawAxis(1), 0);
}