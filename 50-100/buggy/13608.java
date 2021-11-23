public double getAxisDeadzonedSquared(int joystickID, int axisID) {
    double result = controllers[joystickID].getRawAxis(axisID);
    result = result * (-(java.lang.Math.abs(result)));
    return (java.lang.Math.abs(result)) > 0.05 ? result : 0;
}