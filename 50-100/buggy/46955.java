@butterknife.OnClick(value = R.id.wifi_connect_button)
void connectToVenuesWifi() {
    wifiConnectButton.setVisibility(View.GONE);
    wifiConnectionProgress.setVisibility(View.VISIBLE);
    final android.content.Context context = getContext();
    final int networkId = fr.paug.androidmakers.util.WifiUtil.getVenuesWifiNetworkId(context);
    if (networkId != (-1)) {
        if (fr.paug.androidmakers.util.WifiUtil.connectToWifi(context, networkId)) {
            wifiConnectionProgress.setVisibility(View.GONE);
        }
    }
}