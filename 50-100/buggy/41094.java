@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    final int action = android.support.v4.view.MotionEventCompat.getActionMasked(ev);
    if ((action == (android.view.MotionEvent.ACTION_CANCEL)) || (action == (android.view.MotionEvent.ACTION_UP))) {
        mViewDragHelper.cancel();
        return false;
    }
    return mViewDragHelper.shouldInterceptTouchEvent(ev);
}