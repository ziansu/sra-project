@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if (lockMode.allowsTouch()) {
        return super.onTouchEvent(ev);
    }else {
        return false;
    }
}