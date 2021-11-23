@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.wifi_networks_refresh_button :
            wifi_networks_names.clear();
            wifi_networks_lv_adapter.clear();
            wifi_networks_map.clear();
            android.widget.Toast.makeText(getApplicationContext(), "Scanning for Wifi networks...", Toast.LENGTH_LONG).show();
            wifi.startScan();
            break;
        default :
            break;
    }
}