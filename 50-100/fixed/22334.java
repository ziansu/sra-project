public void stop(boolean attemptCompleted) {
    if ((this.state) != (org.fenix.llanfair.Run.State.ONGOING)) {
        throw new java.lang.IllegalStateException("run is not on-going");
    }
    this.state = org.fenix.llanfair.Run.State.STOPPED;
    this.pcSupport.firePropertyChange("run.state", org.fenix.llanfair.Run.State.ONGOING, this.state);
    if (attemptCompleted) {
        int attemptCompletedCount = getAttemptCompletedCount();
        addCompletedAttempt();
    }
}