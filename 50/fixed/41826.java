@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    return (gestureDetector.onTouchEvent(event)) || (super.onTouchEvent(event));
}