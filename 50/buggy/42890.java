@java.lang.Override
protected void updateState(long time) {
    long dTime = time - (this.fPrevTick);
    if (dTime >= 1000) {
        this.equalizeTemperatures();
        this.fPrevTick = time;
    }
}