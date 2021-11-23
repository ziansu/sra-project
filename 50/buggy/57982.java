@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    gestureDetector.onTouchEvent(event);
    return ((event.getAction()) != (android.view.MotionEvent.ACTION_UP)) && ((focused) != (-1));
}