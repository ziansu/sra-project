@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if ((!(isEnabled())) || (!(isTouchEnabled()))) {
        return super.onTouchEvent(ev);
    }
    final int action = android.support.v4.view.MotionEventCompat.getActionMasked(ev);
    try {
        mDragHelper.processTouchEvent(ev);
        return true;
    } catch (java.lang.Exception ex) {
        return false;
    }
}