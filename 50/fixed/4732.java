@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    try {
        return super.onInterceptTouchEvent(ev);
    } catch (java.lang.IllegalArgumentException | java.lang.ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
    }
    return false;
}