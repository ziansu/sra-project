public void robotInit() {
    frontLeft = new edu.wpi.first.wpilibj.Talon(0);
    rearLeft = new edu.wpi.first.wpilibj.Talon(1);
    frontRight = new edu.wpi.first.wpilibj.Talon(2);
    rearRight = new edu.wpi.first.wpilibj.Talon(3);
    myRobot = new edu.wpi.first.wpilibj.RobotDrive(rearLeft, frontLeft, rearRight, frontRight);
}