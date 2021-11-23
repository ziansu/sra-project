public void move(long time) {
    if ((mStep) == 0) {
        mStep = (mDetalX) * time;
    }
    if (time > 0) {
        this.offsetX += mStep;
    }
}