void cancel() {
    controller = null;
    isScrollEvent = false;
    imageMatrix = viewMatrix();
    invalidate();
}