public void operatorControl() {
    while (isEnabled()) {
        edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Gyro Output: ", sana.cantabile.getAngle());
        sana.updateGyro();
        if ((heavensWrit) != (commandChooser.getSelected())) {
            heavensWrit.cancel();
            heavensWrit = commandChooser.getSelected();
            heavensWrit.start();
        }
        edu.wpi.first.wpilibj.Timer.delay(0.005);
    } 
}