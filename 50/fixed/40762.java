void disconnect() {
    if ((mService) == null)
        return ;
    
    mContext.unbindService(mConnection);
    mService = null;
    mHandler.removeCallbacksAndMessages(null);
}