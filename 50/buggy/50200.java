@java.lang.Override
public boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) {
    mOffset += getHoizontalDistance((-distanceX));
    requestLayout();
    return true;
}