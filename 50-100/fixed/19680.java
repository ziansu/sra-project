public void setWifi(android.view.View v) {
    aloksharma.ufl.edu.athome.MainActivity.ChangeWifiDialogFragment changeWifiDialogFragment = new aloksharma.ufl.edu.athome.MainActivity.ChangeWifiDialogFragment();
    if ((wifiChecker.getWifiID(this)) != null) {
        changeWifiDialogFragment.show(getFragmentManager(), "guitar");
    }else {
        android.widget.Toast.makeText(this, "Not connected to a WiFi.", Toast.LENGTH_SHORT).show();
    }
}