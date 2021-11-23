public void drive(double forward, double strafe, double rotation, double heading) {
    DRIVE.mecanumDrive_Cartesian(forward, strafe, rotation, org.usfirst.frc.team5338.robot.subsystems.DriveTrain.IMU.getCompassHeading());
    DRIVE.arcadeDrive(forward, rotation, false);
}