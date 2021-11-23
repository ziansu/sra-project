@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    switch (ev.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            mDownY = mLastY = ev.getY();
            isTouchIntercept = false;
            isAllowToScrollBack = false;
            scroller.forceFinished(false);
            recordScrollDistance();
            break;
    }
    return super.onInterceptTouchEvent(ev);
}