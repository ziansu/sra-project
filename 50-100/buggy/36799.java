@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getPointerCount()) < 2) {
        if (mSingleDetector.onTouchEvent(event)) {
            return true;
        }else {
            mSingleDetectorGesture.continueEvent(event);
        }
    }else {
        mMultiDetector.onTouch(event);
    }
    if ((mUserTouchListener) != null) {
        mUserTouchListener.onTouch(v, event);
    }
    return true;
}