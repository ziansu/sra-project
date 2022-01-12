public void showDeviceDetail(android.net.wifi.p2p.WifiP2pDevice device) {
    mDevice = device;
    this.getView().setVisibility(View.VISIBLE);
    android.widget.TextView view = ((android.widget.TextView) (mContentView.findViewById(R.id.device_address)));
    view.setText(device.deviceAddress);
    view = ((android.widget.TextView) (mContentView.findViewById(R.id.device_info)));
    view.setText(device.toString());
}