public void setSize(int size) {
    if ((mSize) != size) {
        mSize = size;
        updateCircleSize();
        updateDrawableSize();
        updateBackground();
    }
}