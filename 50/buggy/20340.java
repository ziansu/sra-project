public void move(long time) {
    if ((mStep) == 0) {
        mStep = (mDetalX) * time;
    }
    this.offsetX += mStep;
}