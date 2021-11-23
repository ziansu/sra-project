public synchronized void release() {
    if (((mServiceInterface) != null) && ((mCallbackHandler) != null)) {
        try {
            mServiceInterface.unregisterRemoteController(mCallbackHandler);
        } catch (java.lang.IllegalStateException e) {
        } catch (android.os.RemoteException e) {
        }
        mServiceInterface = null;
    }
    if ((mServiceConnection) != null) {
        try {
            mCtx.unbindService(mServiceConnection);
        } catch (java.lang.IllegalStateException e) {
        }
        mServiceConnection = null;
    }
    mCallbackHandler = null;
}