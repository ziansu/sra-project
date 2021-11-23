@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    if ((mDoubletapZoomHandler.getState()) == (cz.mzk.tiledimageview.gestures.PinchZoomHandler.State.ZOOMING)) {
        mDoubletapZoomHandler.stopAnimation();
    }
    if ((mFlingShiftHandler.getmState()) == (cz.mzk.tiledimageview.gestures.PinchZoomHandler.State.SHIFTING)) {
        mFlingShiftHandler.stopAnimation();
    }
    if ((mImageViewApi.getSingleTapListener()) != null) {
        mImageViewApi.getSingleTapListener().onSingleTap(e.getX(), e.getY(), mImageViewApi.getVisibleImageAreaInCanvas());
    }
    return false;
}