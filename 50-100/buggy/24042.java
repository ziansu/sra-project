public void run() {
    if ((mCastManager) != null) {
        mCastManager.decrementUiCounter();
        mCastManager.stopCastDiscovery();
        mCastManager.removeVideoCastConsumer(mCastConsumer);
    }
    if ((mDataCastManager) != null) {
        mDataCastManager.decrementUiCounter();
        mDataCastManager.stopCastDiscovery();
        mDataCastManager.removeDataCastConsumer(mDataCastConsumer);
    }
    if ((mMediaRouter) != null)
        mMediaRouter.removeCallback(mMediaRouterCallback);
    
}