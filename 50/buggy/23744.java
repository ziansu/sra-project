@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    gestureDetector.onTouchEvent(event);
    return super.onTouchEvent(event);
}