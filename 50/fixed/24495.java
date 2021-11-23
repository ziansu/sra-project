public void robotInit() {
    org.usfirst.frc3467.robot.CommandBase.init();
    autoChooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto", autoChooser);
}