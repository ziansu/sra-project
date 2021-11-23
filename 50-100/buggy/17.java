public static void registerLister(final android.app.Activity activity, com.zhanshow.mylibrary.network.NetworkStateReceiver.NetworkStateReceiverListener listener) {
    com.zhanshow.mylibrary.network.LibraryConfig.getInstance().initApplication(activity);
    com.zhanshow.mylibrary.network.NetWorkUtils.mNetworkStateReceiver = new com.zhanshow.mylibrary.network.NetworkStateReceiver();
    com.zhanshow.mylibrary.network.NetWorkUtils.mNetworkStateReceiver.addListener(listener);
    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    intentFilter.addAction(NetworkStateReceiver.CONNECTIVITY_ACTION_LOLLIPOP);
    activity.registerReceiver(com.zhanshow.mylibrary.network.NetWorkUtils.mNetworkStateReceiver, intentFilter);
}