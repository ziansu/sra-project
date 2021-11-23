@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if (!(gestureDetector.onTouchEvent(event))) {
        return super.onTouchEvent(event);
    }
    return true;
}