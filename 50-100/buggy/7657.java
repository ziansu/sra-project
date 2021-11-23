@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    mX = ((int) (event.getX()));
    mY = ((int) (event.getY()));
    logTouchEvent();
    setPlacing(true);
    return super.onTouchEvent(event);
}