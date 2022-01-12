@java.lang.Override
protected void onStop() {
    mGoogleApiClient.disconnect();
    if (((lineShape) != null) && ((lineShape.size()) > 1)) {
        lineShape.add(mPolyline);
        java.lang.String geoJsonString = edu.uw.longt8.geopaint.GeoJsonConverter.convertToGeoJson(lineShape);
        new edu.uw.longt8.geopaint.MapsActivity.SaveState().execute(geoJsonString);
    }
    super.onStop();
}