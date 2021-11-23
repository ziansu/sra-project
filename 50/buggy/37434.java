private void animateToLocation(final org.osmdroid.util.GeoPoint location) {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mapView.getController().animateTo(location);
        }
    }, 200);
}