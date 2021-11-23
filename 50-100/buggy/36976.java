private void stopVpn() {
    if ((mBinder) == null)
        return ;
    
    mStopping = true;
    try {
        mBinder.stop();
    } catch (java.lang.Exception e) {
    }
    getActivity().unbindService(mConnection);
    checkState();
}