public void init(android.content.Context context) {
    mContext = context;
    mConnectivityManager = ((android.net.ConnectivityManager) (mContext.getSystemService(Context.CONNECTIVITY_SERVICE)));
    mTelephonyManager = ((android.telephony.TelephonyManager) (context.getSystemService(Context.TELEPHONY_SERVICE)));
    android.content.IntentFilter filter = new android.content.IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION);
    yellow5a5.nougatnetworktool.NougatNetworkTool.NetworkReceiver mNetworkReceiver = new yellow5a5.nougatnetworktool.NougatNetworkTool.NetworkReceiver();
    context.registerReceiver(mNetworkReceiver, filter);
}