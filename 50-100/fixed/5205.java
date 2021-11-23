public boolean getButtonPush(int button) {
    boolean returnValue;
    boolean newState = super.getRawButton(button);
    if ((newState == true) && (newState != (buttonState[button]))) {
        returnValue = true;
    }else {
        returnValue = false;
    }
    buttonState[button] = newState;
    return returnValue;
}