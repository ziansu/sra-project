@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        if (!(mWifiManager.isWifiEnabled())) {
            mWifiManager.setWifiEnabled(true);
        }
    }else {
        if (mWifiManager.isWifiEnabled()) {
            mWifiManager.setWifiEnabled(false);
        }
    }
}