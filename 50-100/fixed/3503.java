@java.lang.Override
public void onClick(android.view.View v) {
    mGeoPoint = mMyLocationOverlay.getMyLocation();
    android.content.Intent i = new android.content.Intent();
    android.os.Bundle b = new android.os.Bundle();
    if ((mGeoPoint) != null) {
        b.putString(tw.edu.ntu.fortour.LocationMap.KEY_LONGITUDE, java.lang.Integer.toString(mGeoPoint.getLongitudeE6()));
        b.putString(tw.edu.ntu.fortour.LocationMap.KEY_LATITUDE, java.lang.Integer.toString(mGeoPoint.getLatitudeE6()));
        i.putExtras(b);
    }
    setResult(Activity.RESULT_OK, i);
    this.finish();
}