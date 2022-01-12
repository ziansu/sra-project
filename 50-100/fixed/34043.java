public void onActionUpOrCancel(boolean isExpanded) {
    if (!(mIsFirstExpanded))
        return ;
    
    if ((getChildCount()) == 0)
        return ;
    
    mIsFirstExpanded = false;
    if (isExpanded) {
        boolean isRippleAnimEnabled = (getChildCount()) > 0;
        if (isRippleAnimEnabled) {
            if (mRippleAnimatorHelper.isAnimationStarted())
                return ;
            
            mRippleAnimatorHelper.launchAnim(mRadius, getMeasuredWidth());
        }else {
            if ((mRippleListener) != null)
                mRippleListener.onRippleAnimFinished((-1));
            
        }
    }
}