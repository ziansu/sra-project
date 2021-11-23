private boolean getAxisPressed(int ID, org.usfirst.frc.team1528.robot.Joystick currentDriver, boolean axisPositive) {
    boolean pressed;
    if (((buffer(ID, driver, true, 0.18, (-0.18))) > 0.0) == axisPositive) {
        pressed = true;
    }else
        if (((buffer(ID, driver, true, 0.18, (-0.18))) < 0.0) == (!axisPositive)) {
            pressed = true;
        }else {
            pressed = false;
        }
    
    return pressed;
}