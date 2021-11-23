public void robotInit() {
    org.usfirst.frc3467.robot.CommandBase.init();
    autoChooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    autoChooser.addDefault("Default Auto", new org.usfirst.frc3467.subsystems.Example.ExampleCommand());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto", autoChooser);
}