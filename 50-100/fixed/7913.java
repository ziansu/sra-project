public void timedActions() {
    if ((timer.getTick()) > 0) {
        timer.tick();
        currentTick = timer.getTick();
        java.lang.System.out.println(currentTick);
    }
    if ((currentTick) == 5) {
        java.lang.System.out.println("Resetting...");
        relay.set(Value.kOff);
        barrelMotor.set(0.25);
    }
    if ((currentTick) == 53) {
        barrelMotor.set(0);
        timer.reset();
    }
}