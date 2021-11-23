@java.lang.Override
public void run() {
    if (mFlingScroller.isFinished()) {
        setMode(com.otaliastudios.zoom.ZoomEngine.NONE);
    }else
        if (mFlingScroller.computeScrollOffset()) {
            final int newPanX = mFlingScroller.getCurrX();
            final int newPanY = mFlingScroller.getCurrY();
            moveTo(getZoom(), (newPanX - (getScaledPanX())), (newPanY - (getScaledPanY())), true, false);
            mView.postOnAnimation(this);
        }
    
}