public void robotInit() {
    org.usfirst.frc4915.MecanumDrive.RobotMap.init();
    org.usfirst.frc4915.MecanumDrive.Robot.driveTrain = new org.usfirst.frc4915.MecanumDrive.DriveTrain();
    org.usfirst.frc4915.MecanumDrive.Robot.elevator = new org.usfirst.frc4915.MecanumDrive.Elevator();
    org.usfirst.frc4915.MecanumDrive.Robot.grabber = new org.usfirst.frc4915.MecanumDrive.Grabber();
    org.usfirst.frc4915.MecanumDrive.Robot.oi = new org.usfirst.frc4915.MecanumDrive.OI();
    RobotMap.gyro.reset();
    autonomousCommand = ((new org.usfirst.frc4915.MecanumDrive.AutonomousCommand()) < (HEAD)) == (autoChooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Autonomous mode chooser", autoChooser);
    org.usfirst.frc4915.MecanumDrive.SendUserMessage.displayMessage();
}