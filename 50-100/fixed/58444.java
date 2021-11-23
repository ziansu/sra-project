public void operatorControl() {
    while (isEnabled()) {
        if ((heavensWrit) != (commandChooser.getSelected())) {
            heavensWrit.cancel();
            heavensWrit = commandChooser.getSelected();
            heavensWrit.start();
        }
        edu.wpi.first.wpilibj.Timer.delay(0.005);
    } 
}