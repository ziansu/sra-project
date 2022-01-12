@java.lang.Override
public boolean onTouchEvent(@android.support.annotation.NonNull
android.view.MotionEvent ev) {
    if ((!(isEnabled())) || (!(isTouchEnabled()))) {
        return super.onTouchEvent(ev);
    }
    try {
        mDragHelper.processTouchEvent(ev);
        return true;
    } catch (java.lang.Exception ex) {
        return false;
    }
}