@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    intentFilter.addAction("android.location.PROVIDERS_CHANGED");
    getActivity().registerReceiver(receiver, intentFilter);
    setup();
}