@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    MainActivity.mainContext = context;
    android.net.NetworkInfo netinfo = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);
    if ((netinfo != null) && (netinfo.isConnected())) {
        new lk.cse13.www.uomwireless.BackgroundLogin(0).execute();
    }else {
        lk.cse13.www.uomwireless.Operations.cancelNotification();
    }
}