@java.lang.Override
public void onResume() {
    getActivity().registerReceiver(mConnectivityReceiver, new android.content.IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION));
    getLocalBroadcastManager().registerReceiver(mBroadcastReceiver, getIntentFilter());
    super.onResume();
}