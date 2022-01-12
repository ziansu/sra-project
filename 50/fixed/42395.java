public void setMaxProcessWaitingRatio(double maxProcessWaitingRatio) {
    if ((maxProcessWaitingRatio <= 0) || (maxProcessWaitingRatio > 1)) {
        throw new java.lang.IllegalArgumentException("maxProcessWaitingRatio has to be between 0 and 1");
    }
    this.maxProcessWaitingRatio = maxProcessWaitingRatio;
    if (running) {
        reset();
    }
}