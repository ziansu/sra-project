@java.lang.Override
protected void autonomousMain() throws ccre.instinct.AutonomousModeOverException, java.lang.InterruptedException {
    try {
        Elevator.setBottom.event();
        waitUntil(Elevator.atBottom);
        Rollers.open.set(true);
        Rollers.direction.set(false);
        Rollers.running.set(true);
        waitUntil(ccre.ctrl.BooleanMixing.invert(AutoLoader.crateInPosition));
        waitForTime(timeout);
        Rollers.running.set(false);
    } finally {
        running.set(false);
    }
}