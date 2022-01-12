@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    currentLocation = location;
    android.widget.TextView txtPrecision = ((android.widget.TextView) (this.getView().findViewById(R.id.txtPrecision)));
    if ((txtPrecision != null) && (location != null)) {
        txtPrecision.setText(java.lang.Float.toString(location.getAccuracy()));
    }
}