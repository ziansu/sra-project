@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    final int action = android.support.v4.view.MotionEventCompat.getActionMasked(ev);
    switch (action) {
        case android.view.MotionEvent.ACTION_CANCEL :
        case android.view.MotionEvent.ACTION_UP :
            {
                mViewDragHelper.cancel();
                return false;
            }
    }
    return mViewDragHelper.shouldInterceptTouchEvent(ev);
}