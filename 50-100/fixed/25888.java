public void moveElevator(double speed) {
    if ((getPosition()) <= 0) {
        if (speed < 0) {
            speed = 0;
        }
    }
    if ((getPosition()) >= 66) {
        if (speed > 0) {
            speed = 0;
        }
    }
    changeControlModeWinch(ControlMode.Speed);
    winch.set(speed);
}