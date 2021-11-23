public void zoomHoming(android.graphics.Rect drawingRect) {
    if (me.kareluo.intensify.image.Utils.contains(mImageArea, drawingRect))
        return ;
    
    if (mZoomAnimator.isRunning())
        mZoomAnimator.cancel();
    
    mStartRect.set(mImageArea);
    mEndRect.set(mImageArea);
    me.kareluo.intensify.image.Utils.home(mEndRect, drawingRect);
    mZoomAnimator.start();
}