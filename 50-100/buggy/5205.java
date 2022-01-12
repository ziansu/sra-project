public boolean getButtonPush(int button) {
    boolean returnValue;
    boolean newState = super.getRawButton(button);
    if ((newState == true) && (newState != (buttonState[(button - 1)]))) {
        returnValue = true;
    }else {
        returnValue = false;
    }
    buttonState[(button - 1)] = newState;
    return returnValue;
}