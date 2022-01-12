@java.lang.Override
public void onClick(android.view.View v) {
    android.net.wifi.p2p.WifiP2pConfig config = new android.net.wifi.p2p.WifiP2pConfig();
    config.deviceAddress = device.deviceAddress;
    config.wps.setup = android.net.wifi.WpsInfo.PBC;
    progressDialog = android.app.ProgressDialog.show(getActivity(), "Press back to cancel", ("Connecting to :" + (device.deviceAddress)), true, true);
    ((com.swipetogive.wifidirect.DeviceListFragment.DeviceActionListener) (getActivity())).connect(config);
}