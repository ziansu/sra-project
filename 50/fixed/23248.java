public void robotInit() {
    com.nicoletfear.Stronghold2016.Robot.oi = new com.nicoletfear.Stronghold2016.OI();
    chooser = new edu.wpi.first.wpilibj.smartdashboard.SendableChooser();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putData("Auto mode", chooser);
}