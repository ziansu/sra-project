@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d("MapFragment", "onLocationChanged");
    this.sendLocationToServer(location);
    if (((this.getActivity()) != null) && (((android.widget.ToggleButton) (this.getActivity().findViewById(R.id.button))).isChecked())) {
        this.centering = true;
        mapView.getController().animateTo(new org.osmdroid.util.GeoPoint(location));
    }
    this.mapDrawer.onLocationChanged(location);
}