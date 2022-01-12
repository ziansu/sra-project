public double joystickDeadZone(double value) {
    if ((value > 0.01) || (value < (-0.01))) {
        return (value - 0.01) / 0.99;
    }else
        if (value < (-0.01)) {
            return (value + 0.01) / 0.99;
        }
    
    return 0.0;
}