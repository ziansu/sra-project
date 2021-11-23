public boolean dispatchTouchEvent(android.view.MotionEvent motionevent) {
    super.dispatchTouchEvent(motionevent);
    mFragment.scaleDetector.onTouchEvent(motionevent);
    mFragment.handleTouchEvent(motionevent);
    mFragment.gestureDetector.onTouchEvent(motionevent);
    return mFragment.gestureDetector.onTouchEvent(motionevent);
}