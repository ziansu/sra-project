@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if (!(mGestureDetector.onTouchEvent(event))) {
        if (((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) && (isScrolling)) {
            onScrollXEnd();
            isScrolling = false;
        }
        if ((event.getAction()) == (android.view.MotionEvent.ACTION_CANCEL)) {
            onScrollXEnd();
            isScrolling = false;
        }
        return true;
    }
    return true;
}