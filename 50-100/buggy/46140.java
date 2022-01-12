void overridePendingAppTransition(java.lang.String packageName, int enterAnim, int exitAnim, android.os.IRemoteCallback startedCallback) {
    if (mNoOverrides)
        return ;
    
    if (isTransitionSet()) {
        mNextAppTransitionType = com.android.server.wm.AppTransition.NEXT_TRANSIT_TYPE_CUSTOM;
        mNextAppTransitionPackage = packageName;
        mNextAppTransitionThumbnail = null;
        mNextAppTransitionEnter = enterAnim;
        mNextAppTransitionExit = exitAnim;
        postAnimationCallback();
        mNextAppTransitionCallback = startedCallback;
    }else {
        postAnimationCallback();
    }
}