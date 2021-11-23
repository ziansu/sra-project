@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    if (mFabAnimatorBuilder.isAnimating()) {
        return true;
    }
    return super.dispatchTouchEvent(ev);
}