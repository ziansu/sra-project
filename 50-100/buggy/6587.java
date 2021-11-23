public void robotInit() {
    java.lang.System.out.println("TEST");
    stick = new edu.wpi.first.wpilibj.Joystick(1);
    drive = new org.usfirst.frc.team5026.robot.subsystems.Drive();
    org.usfirst.frc.team5026.robot.Robot.oi = new org.usfirst.frc.team5026.robot.OI();
    chooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    chooser.addDefault("Default Auto", new org.usfirst.frc.team5026.robot.commands.ExampleCommand());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto mode", chooser);
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Motor Output", 0.5);
    org.usfirst.frc.team5026.robot.Robot.hardware = new org.usfirst.frc.team5026.robot.Hardware();
}