@java.lang.Override
public void autonomousInit() {
    java.lang.String mode = ((java.lang.String) (modeChooser.getSelected()));
    if (mode == "forward") {
        edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putString("", "Test Forward");
    }else
        if (mode == "gear") {
            edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putString("", "Test Gear");
        }else {
            edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putString("", "Test Nothing");
        }
    
    if ((autonomousCommand) != null)
        autonomousCommand.start();
    
}