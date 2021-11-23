@java.lang.Override
public void onStatusChanged(java.lang.String s, int i, android.os.Bundle bundle) {
    android.util.Log.d("GPSTest", "onStatusChanged called");
    checkLocationProviderEnabled();
}