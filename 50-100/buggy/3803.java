@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    v.onTouchEvent(event);
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
        if (testResultHolder.longPressed) {
            testResultHolder.longPressed = false;
            mAdapterCallback.restart((position - 1));
        }
    }
    return false;
}