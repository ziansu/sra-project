@java.lang.Override
public void showDetails(android.net.wifi.p2p.WifiP2pDevice device) {
    android.util.Log.d("details", "details-wifi-direct");
    com.swipetogive.wifidirect.DeviceDetailFragment fragment = ((com.swipetogive.wifidirect.DeviceDetailFragment) (getFragmentManager().findFragmentById(R.id.frag_detail)));
    fragment.showDetails(device);
}