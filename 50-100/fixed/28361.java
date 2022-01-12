public void robotInit() {
    org.usfirst.frc.team5519.robot.RobotMap.init();
    chooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    chooser.addDefault("Default Auto", defaultAuto);
    chooser.addObject("My Auto", customAuto);
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto choices", chooser);
    org.usfirst.frc.team5519.robot.Robot.arm = new org.usfirst.frc.team5519.subsystems.SimpleArm();
    org.usfirst.frc.team5519.robot.Robot.arm.initHardware();
    org.usfirst.frc.team5519.robot.Robot.oi = new org.usfirst.frc.team5519.robot.OI();
    org.usfirst.frc.team5519.robot.Robot.driveBase = new org.usfirst.frc.team5519.robot.DriveBaseTwoMotor();
    org.usfirst.frc.team5519.robot.Robot.teleopStation = new org.usfirst.frc.team5519.robot.TeleopStationOneStick();
    driveCount = 0;
}