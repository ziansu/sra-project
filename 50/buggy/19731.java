@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    dispatchJSTouchEvent(ev);
    super.onTouchEvent(ev);
    return true;
}