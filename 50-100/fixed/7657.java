@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    mX = ((int) (event.getX()));
    mY = ((int) (event.getY()));
    logTouchEvent();
    return super.onTouchEvent(event);
}