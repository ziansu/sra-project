public boolean shouldShowButtons() {
    android.widget.Toast.makeText(this, "shouldShowButtons fired", Toast.LENGTH_SHORT).show();
    boolean show = false;
    if ((mGoogleApiClient) != null) {
        if (((mMap.isMyLocationEnabled()) && ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) && (com.viktorsandstrom.myvicinity.util.Util.isGPSEnabled(this))) {
            show = true;
        }
    }
    return show;
}