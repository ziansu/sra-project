public boolean startAnimation(float position) {
    if ((mThumbPosition) == position)
        return false;
    
    mPosition = position;
    if ((getHandler()) != null) {
        resetAnimation();
        mRunning = true;
        getHandler().postAtTime(this, ((android.os.SystemClock.uptimeMillis()) + (com.rey.material.util.ViewUtil.FRAME_DURATION)));
        invalidate();
        return true;
    }else {
        mThumbPosition = position;
        invalidate();
        return false;
    }
}