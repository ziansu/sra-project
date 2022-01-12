@java.lang.Override
public void autonomousInit() {
    autonomousCommand = ((edu.wpi.first.wpilibj.command.Command) (modeChooser.getSelected()));
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