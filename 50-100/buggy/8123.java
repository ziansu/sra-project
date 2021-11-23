public boolean startAnimation(int radius) {
    if ((mThumbCurrentRadius) == radius)
        return false;
    
    mRadius = radius;
    if ((getHandler()) != null) {
        resetAnimation();
        mRunning = true;
        getHandler().postAtTime(this, ((android.os.SystemClock.uptimeMillis()) + (com.rey.material.util.ViewUtil.FRAME_DURATION)));
    }else
        mThumbCurrentRadius = mRadius;
    
    invalidate();
    return true;
}