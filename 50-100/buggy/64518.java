private java.lang.Object addPlacemarkToMap(com.google.maps.android.kml.KmlPlacemark placemark, boolean placemarkVisibility) {
    java.lang.String placemarkId = placemark.getStyleId();
    com.google.maps.android.kml.KmlGeometry geometry = placemark.getGeometry();
    com.google.maps.android.kml.KmlStyle style = getPlacemarkStyle(placemarkId);
    com.google.maps.android.kml.KmlStyle inlineStyle = placemark.getInlineStyle();
    return addToMap(placemark, geometry, style, inlineStyle, placemarkVisibility);
}