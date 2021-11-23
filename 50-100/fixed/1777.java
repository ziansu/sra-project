public void setState(@org.bottiger.podcast.views.drawables.PlayPauseDrawable.IconState
int argState) {
    mLock.lock();
    try {
        if (argState == (mDrawable.getIconState()))
            return ;
        
        if (((mAnimatorSet) != null) && (mAnimatorSet.isRunning()))
            return ;
        
    } finally {
        mLock.unlock();
    }
}