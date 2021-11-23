@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    return (isSlide) || (super.onInterceptTouchEvent(ev));
}