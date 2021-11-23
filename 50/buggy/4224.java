private void updatePortActionHandler(android.content.Intent intent) {
    int port = intent.getIntExtra(WifiP2pService.INTENT_EXTRA_REGISTRATION_PORT, 0);
    if (port == 0) {
        ip = "";
    }
    wifiP2pActivity.setPort(port);
}