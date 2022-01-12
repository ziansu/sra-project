@java.lang.Override
public void robotInit() {
    chooser.addDefault("Default Auto", defaultAuto);
    chooser.addObject("My Auto", customAuto);
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto choices", chooser);
    myGamepad = new edu.wpi.first.wpilibj.XboxController(0);
    gyro = new edu.wpi.first.wpilibj.ADXRS450_Gyro();
    gyro.calibrate();
    sparkLeft = new edu.wpi.first.wpilibj.Spark(0);
    sparkRight = new edu.wpi.first.wpilibj.Spark(1);
    drive = new org.usfirst.frc.team6542.robot.XboxDrive(sparkLeft, sparkRight, myGamepad, gyro);
}