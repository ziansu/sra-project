@java.lang.Override
public void onRefreshComplete(me.dkzwm.smoothrefreshlayout.SmoothRefreshLayout layout, boolean isSuccessful) {
    if (layout.equalsOnHookHeaderRefreshCompleteCallback(mHookUIRefreshCompleteCallBack)) {
        int duration = layout.getDurationToCloseHeader();
        if (duration > 0)
            mCachedDuration = duration;
        
        layout.setDurationToCloseHeader(0);
        return ;
    }
    long duration = layout.getDurationToCloseHeader();
    mAnimator.setDuration(duration);
    mAnimator.start();
}