@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    com.example.pyeonsangjin.ssmproject.MainActivity.longitude = loc.getLongitude();
    com.example.pyeonsangjin.ssmproject.MainActivity.latitude = loc.getLatitude();
}