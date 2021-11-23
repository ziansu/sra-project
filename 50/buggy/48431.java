public boolean dispatchTouchEvent(android.view.MotionEvent motionevent) {
    super.dispatchTouchEvent(motionevent);
    mFragment.scaleDetector.onTouchEvent(motionevent);
    mFragment.gestureDetector.onTouchEvent(motionevent);
    mFragment.handleTouchEvent(motionevent);
    return mFragment.gestureDetector.onTouchEvent(motionevent);
}