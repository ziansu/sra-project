public void connectToNetworkService() {
    com.android1.homework3.Logger.d("Connect to network service");
    disconnect();
    android.content.Intent intent = new android.content.Intent(this, com.android1.homework3.net.NetworkService.class);
    bindService(intent, mServiceConnection, com.android1.homework3.ui.BIND_AUTO_CREATE);
}