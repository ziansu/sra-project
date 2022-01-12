@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (null == intent) {
        return ;
    }
    if (!(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction()))) {
        return ;
    }
    android.net.NetworkInfo lastNetwork = mCurrentNetwork;
    boolean noConnectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
    if (noConnectivity) {
        mNetworkConnected = false;
        mCurrentNetwork = null;
    }else {
        mCurrentNetwork = mConnectivityManager.getActiveNetworkInfo();
    }
    mNetworkObservable.notifyNetworkChaged(noConnectivity, mCurrentNetwork, lastNetwork);
}