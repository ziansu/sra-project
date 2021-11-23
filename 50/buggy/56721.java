protected boolean isFinished() {
    return Robot.instance.elevator.limitSwitch.get();
}