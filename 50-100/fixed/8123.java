public boolean startAnimation(int radius) {
    if ((mThumbCurrentRadius) == radius)
        return false;
    
    mRadius = radius;
    if ((getHandler()) != null) {
        resetAnimation();
        mRunning = true;
        getHandler().postAtTime(this, ((android.os.SystemClock.uptimeMillis()) + (com.rey.material.util.ViewUtil.FRAME_DURATION)));
        invalidate();
        return true;
    }else {
        mThumbCurrentRadius = mRadius;
        invalidate();
        return false;
    }
}