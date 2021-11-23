@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    canPullDown = ((v.getScrollY()) == 0) && ((mCurrentViewIndex) == 1);
    return false;
}