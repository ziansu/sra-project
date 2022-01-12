public double getLeftJoystickY() {
    double rawInput = -(this.getRawAxis(1));
    if ((rawInput > 0) && (rawInput <= 0.0078125)) {
        return 0;
    }
    return rawInput;
}