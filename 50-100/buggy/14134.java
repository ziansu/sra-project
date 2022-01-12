public void dispose() {
    logDebug("Disposing.");
    mSetupDone = false;
    if ((mServiceConn) != null) {
        logDebug("Unbinding from service.");
        if ((mContext) != null)
            mContext.unbindService(mServiceConn);
        
    }
    mDisposed = true;
    mContext = null;
    mServiceConn = null;
    mService = null;
    mPurchaseListener = null;
}