@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    mScaleGestureDetector.onTouchEvent(event);
    if (!(onScale)) {
        if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
            if (((mQualityView) != null) && (mQualityView.isShown())) {
                mQualityView.hide();
            }
            if ((isInPlayBackState()) && ((mMediaController) != null)) {
                toggleMediaControlsVisibility();
            }
        }
    }
    return false;
}