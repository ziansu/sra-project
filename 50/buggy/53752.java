@java.lang.Override
public void set(java.lang.String ssid, java.lang.String psw) {
    mCenter.cSetSSID(ssid, psw);
    android.widget.Toast.makeText(this, "配置成功", Toast.LENGTH_SHORT).show();
}