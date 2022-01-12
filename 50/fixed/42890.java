@java.lang.Override
protected void updateState(long time) {
    super.updateState(time);
    long dTime = time - (this.fPrevTick);
    if (dTime >= 1000) {
        this.fPrevTick = time;
    }
}