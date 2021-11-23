private boolean dispatchUp(android.view.MotionEvent ev, int actionIndex) {
    android.util.Log.d(com.github.alexpfx.fieldonmap.lib.InputDetector.TAG, ("dispatchUp: " + actionIndex));
    int pointerId = ev.getPointerId(actionIndex);
    int pointerIndex = ev.findPointerIndex(pointerId);
    control.up(ev.getX(pointerId), ev.getY(pointerId), pointerId, pointerIndex);
    return false;
}