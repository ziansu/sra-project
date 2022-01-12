private void onConnectionChanged(android.content.Intent intent) {
    android.net.NetworkInfo networkInfo = intent.getParcelableExtra(WifiP2pManager.EXTRA_NETWORK_INFO);
    if (((networkInfo.isConnected()) && (!(mIsTryingToConnect))) && (!(isConnected()))) {
        android.util.Log.d(TAG, "No socket open. Trying to connect");
        mIsTryingToConnect = true;
        mManager.requestConnectionInfo(mChannel, this);
    }else {
        this.disconnected();
    }
}