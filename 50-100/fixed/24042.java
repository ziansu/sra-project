public void run() {
    if ((mCastManager) != null) {
        mCastManager.decrementUiCounter();
        mCastManager.stopCastDiscovery();
    }
    if ((mDataCastManager) != null) {
        mDataCastManager.decrementUiCounter();
        mDataCastManager.stopCastDiscovery();
    }
    if ((mMediaRouter) != null)
        mMediaRouter.removeCallback(mMediaRouterCallback);
    
}