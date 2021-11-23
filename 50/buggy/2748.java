@java.lang.Override
public void handleGrip(int pointerIndex, int pointerId, android.view.MotionEvent ev) {
    y = ev.getY(pointerIndex);
    contentBottomFixed = contentBottomCurrent;
    velocityTracker = android.view.VelocityTracker.obtain();
    velocityTracker.addMovement(ev);
    animator.cancel();
}