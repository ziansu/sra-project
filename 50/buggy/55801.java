public void setSize(int size) {
    if ((this.mSize) != size) {
        this.mSize = size;
        updateCircleSize();
        updateDrawableSize();
        updateBackground();
    }
}