protected void execute() {
    if (timer.hasPeriodPassed(pulse)) {
        sign *= -1;
    }
    Robot.movementSubsystem.move(((SPEED) * 0.5), ((sign) * (SPEED)));
}