@java.lang.Override
public synchronized void changeSpeedFactor(double newSpeedFactor) {
    if (!(simulationClock.isStopped())) {
        simulationClock.changeSpeedFactor(newSpeedFactor);
    }
}