public double getOperatorJoystickY() {
    return com.nutrons.lib.Utils.deadband(operatorPad.getRawAxis(1), 0.1, 0);
}