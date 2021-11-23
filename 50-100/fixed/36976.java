private void stopVpn() {
    if ((mBinder) == null)
        return ;
    
    mStopping = true;
    try {
        mBinder.stop();
    } catch (java.lang.Exception e) {
    }
    mBinder = null;
    getActivity().unbindService(mConnection);
    checkState();
}