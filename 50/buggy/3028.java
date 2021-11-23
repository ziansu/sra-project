@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
    io.rmiri.skeleton.utils.CLog.i(("SkeletonMaster onInterceptTouchEvent  " + (position)));
    return (skeletonAttribute.isHoldTouchEventsFromChildren()) || (super.onInterceptTouchEvent(motionEvent));
}