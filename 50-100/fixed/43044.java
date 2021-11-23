@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    android.net.wifi.p2p.WifiP2pDevice device = ((android.net.wifi.p2p.WifiP2pDevice) (getListAdapter().getItem(position)));
    android.widget.Toast.makeText(getActivity(), device.deviceName, Toast.LENGTH_SHORT);
    android.net.wifi.p2p.WifiP2pConfig config = new android.net.wifi.p2p.WifiP2pConfig();
    config.deviceAddress = device.deviceAddress;
    config.wps.setup = android.net.wifi.WpsInfo.PBC;
    ((com.example.photosharing.ProducerActivityFragment.ProducerActionListener) (getActivity())).connect(config);
}