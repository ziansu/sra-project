@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d("QwasiDebug", "On location changed");
    if ((mLastLocation) == null) {
        mLastLocation = new com.qwasi.sdk.QwasiLocation(location);
    }else {
        mLastLocation.initWithLocation(location);
    }
    postToServer();
    io.hearty.witness.Witness.notify(mLastLocation);
}