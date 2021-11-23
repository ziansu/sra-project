protected void setCenter(org.osmdroid.api.IGeoPoint point) {
    if (point == null) {
        final java.lang.String text = getString(R.string.noLocationFound);
        android.widget.Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }else {
        io.github.data4all.logger.Log.i(io.github.data4all.activity.MapActivity.TAG, ("Set Mapcenter to " + (point.toString())));
        mapController.animateTo(point);
        mapController.setCenter(point);
    }
}