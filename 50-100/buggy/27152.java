@java.lang.Override
public void onResume() {
    super.onResume();
    adjustWifiStateButtons();
    receiver = new android.content.BroadcastReceiver() {
        @java.lang.Override
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String action = intent.getAction();
            switch (action) {
                case android.net.wifi.WifiManager.WIFI_STATE_CHANGED_ACTION :
                    adjustWifiStateButtons();
                    break;
            }
        }
    };
    registerReceiver(receiver, intentFilter);
}