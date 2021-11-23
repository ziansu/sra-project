public void robotInit() {
    wapomatic = new org.usfirst.frc.team3322.Talon(6);
    myDrive = new org.usfirst.frc.team3322.RobotDrive(2, 3, 1, 0);
    org.usfirst.frc.team3322.robot.xbox = new org.usfirst.frc.team3322.OI();
    edu.wpi.first.wpilibj.CameraServer.getInstance().startAutomaticCapture();
    org.usfirst.frc.team3322.DriverStation.Alliance color;
    color = ds.getAlliance();
    isRed = color == (DriverStation.Alliance.Red);
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putBoolean("isRed", isRed);
    org.usfirst.frc.team3322.robot.climbcontrol = new org.usfirst.frc.team3322.climber();
    org.usfirst.frc.team3322.DigitalInput testSwitch = new org.usfirst.frc.team3322.DigitalInput(0);
}