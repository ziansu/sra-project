float getFixDragTrans(float delta, float viewSize, float contentSize) {
    if (contentSize <= viewSize) {
        return 0.0F;
    }
    return delta;
}