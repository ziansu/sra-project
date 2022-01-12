@java.lang.Override
public boolean onScroll(android.view.MotionEvent event1, android.view.MotionEvent event2, float distanceX, float distanceY) {
    java.lang.System.out.println("-------OnGestureListener:onScroll()");
    if (((mPreviousView) == null) && ((mNextView) == null)) {
        java.lang.System.out.println("-------OnGestureListener:mPreviousView == null && mNextView == null");
        isScrolling = false;
        return true;
    }
    isScrolling = true;
    onScrollX(event1, event2, distanceX);
    return true;
}