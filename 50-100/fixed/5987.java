public void setPivot(double Joystick) {
    if ((Joystick < 0) && ((MIN_SWITCH.get()) == false)) {
        PIVOT_MOTOR.set(Joystick);
    }
    if ((Joystick > 0) && ((MAX_SWITCH.get()) == false)) {
        PIVOT_MOTOR.set(Joystick);
    }else {
        PIVOT_MOTOR.set(0);
    }
}