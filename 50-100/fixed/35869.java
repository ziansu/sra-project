private void send(java.lang.String target, java.lang.String msg) {
    if ((mSharedPrefs.getConnectivityType()) == 1) {
        if ((babyfon.view.activity.MainActivity.mBoundService) != null) {
            MainActivity.mBoundService.getConnection().sendMessage((msg + ";"));
        }
    }else
        if ((mSharedPrefs.getConnectivityType()) == 2) {
            new babyfon.connectivity.wifi.TCPSender(mContext).sendMessage(target, msg);
        }
    
}