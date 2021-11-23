@java.lang.Override
public void onDestroy() {
    id.ncr.jamsholatapp.activities.MainActivity.mBluetooth.Disconnect();
    id.ncr.jamsholatapp.activities.MainActivity.gps.stopUsingGPS();
    finish();
    super.onDestroy();
}