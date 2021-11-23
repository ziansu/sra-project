@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    if (((getIndicator()) != null) && ((getIndicator().getTranslateState()) == (CustomPagerIndicator.STATE_MOVING))) {
        return true;
    }
    return isCanSliding;
}