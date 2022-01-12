public void setButton(java.lang.String name, int buttonNum) {
    buttons_.put(name, new org.usfirst.frc.team2647.robot.Input.Button(buttonNum, joystick_.getRawButton(buttonNum)));
}