@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, final float velocityY) {
    if ((java.lang.Math.abs(velocityX)) > (java.lang.Math.abs(velocityY))) {
        return false;
    }
    if (isFloat()) {
        return false;
    }
    fling(velocityY);
    return true;
}