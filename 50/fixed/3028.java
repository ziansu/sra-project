@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
    return (skeletonAttribute.isHoldTouchEventsFromChildren()) || (super.onInterceptTouchEvent(motionEvent));
}