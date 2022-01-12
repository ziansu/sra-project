@java.lang.Override
public void run() {
    if (mFlingScroller.isFinished()) {
        setState(com.otaliastudios.zoom.ZoomEngine.NONE);
    }else
        if (mFlingScroller.computeScrollOffset()) {
            @com.otaliastudios.zoom.ZoomEngine.ScaledPan
            final int newPanX = mFlingScroller.getCurrX();
            @com.otaliastudios.zoom.ZoomEngine.ScaledPan
            final int newPanY = mFlingScroller.getCurrY();
            moveTo(getZoom(), (newPanX - (getScaledPanX())), (newPanY - (getScaledPanY())), true, false);
            mView.postOnAnimation(this);
        }
    
}