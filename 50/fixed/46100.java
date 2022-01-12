@java.lang.Override
public boolean handleUpOrCancelTouchEvent(android.view.MotionEvent event) {
    enterState(mBounceBackState);
    return true;
}