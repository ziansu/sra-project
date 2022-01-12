public void populateCapturePoints(java.util.ArrayList<com.demo.arctf.arctfdemo.CapturePoint> capturePointList) {
    if ((mMap) != null) {
        for (com.demo.arctf.arctfdemo.CapturePoint point : capturePointList) {
            com.google.android.gms.maps.model.Marker captureMarker = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(point.getLocation()).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).title(point.getName()));
            capturePoints.put(captureMarker, point);
        }
    }
}