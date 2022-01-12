protected static float getRawX(android.view.MotionEvent event, int pointerIndex) {
    float offset = (event.getX()) - (event.getRawX());
    if (pointerIndex < (event.getPointerCount())) {
        return (event.getX(pointerIndex)) + offset;
    }
    return 0.0F;
}