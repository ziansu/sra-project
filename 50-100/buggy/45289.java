public void showDetails(android.net.wifi.p2p.WifiP2pDevice device) {
    android.util.Log.d("details", "details-frag-details");
    this.device = device;
    this.getView().setVisibility(View.VISIBLE);
    android.widget.TextView view = ((android.widget.TextView) (mContentView.findViewById(R.id.device_address)));
    view.setText(("Device address: " + (device.deviceAddress)));
}