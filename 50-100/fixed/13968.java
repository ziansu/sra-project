@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    boolean flag = mGestureDetector.onTouchEvent(ev);
    int actionMasked = android.support.v4.view.MotionEventCompat.getActionMasked(ev);
    switch (actionMasked) {
        case android.view.MotionEvent.ACTION_CANCEL :
            startSmoothAnimation(mHoverState);
            mDistanceShow = false;
            mFlingShow = false;
            break;
        case android.view.MotionEvent.ACTION_UP :
            if ((mDistanceShow) || (mFlingShow)) {
                startSmoothAnimation((~(mHoverState)));
            }else {
                startSmoothAnimation(mHoverState);
            }
            mDistanceShow = false;
            mFlingShow = false;
            break;
    }
    return flag;
}