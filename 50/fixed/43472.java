public void holdPosition() {
    changeControlModeWinch(ControlMode.Position);
    winch.set(getPosition());
}