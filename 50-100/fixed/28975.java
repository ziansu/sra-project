public boolean wasPressed(java.lang.String name) {
    if (buttons_.containsKey(name)) {
        org.usfirst.frc.team2647.robot.Joy.Button button = buttons_.get(name);
        if (((button.state) == true) && ((button.state) != (button.prevState)))
            return true;
        
    }
    return false;
}