public void moveElevator(double speed) {
    if ((winch.getPosition()) <= 0) {
        if (speed < 0) {
            speed = 0;
        }
    }
    if ((winch.getPosition()) >= 66) {
        if (speed > 0) {
            speed = 0;
        }
    }
    changeControlModeWinch(ControlMode.Speed);
    winch.set(speed);
}