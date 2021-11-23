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
    mNetworkConnected = !noConnectivity;
    if (mNetworkConnected) {
        mCurrentNetwork = mConnectivityManager.getActiveNetworkInfo();
    }else {
        mCurrentNetwork = null;
    }
    mNetworkObservable.notifyNetworkChaged(mNetworkConnected, mCurrentNetwork, lastNetwork);
}