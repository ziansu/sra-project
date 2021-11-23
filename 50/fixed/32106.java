@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    controller.touched(event);
    invalidate();
    return true;
}