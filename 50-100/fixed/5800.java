public void update() {
    boolean rPress = Robot.stick.getRawButton(XboxMap.RB);
    boolean lPress = Robot.stick.getRawButton(XboxMap.LB);
    if (rPress == true) {
        shift(true);
    }else
        if (lPress == true) {
            shift(false);
        }
    
}