@java.lang.Override
public void handleGrip(int pointerIndex, int pointerId, android.view.MotionEvent ev) {
    x = ev.getX(pointerIndex);
    contentLeftFixed = contentLeftCurrent;
    velocityTracker = android.view.VelocityTracker.obtain();
    velocityTracker.addMovement(ev);
}