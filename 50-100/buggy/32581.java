@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int pos, long id) {
    android.net.wifi.ScanResult sResult = rs.get(pos);
    dialog = new com.xpg.gokit.dialog.SetWifiDialog(this, sResult.SSID);
    dialog.setWifiListener(new com.xpg.gokit.dialog.listener.SetWifiListener() {
        @java.lang.Override
        public void set(java.lang.String ssid, java.lang.String psw) {
            mCenter.cSetSSID(ssid, psw);
            android.widget.Toast.makeText(com.xpg.gokit.activity.DeviceApActivity.this, "配置成功", Toast.LENGTH_SHORT).show();
        }
    });
    dialog.show();
}