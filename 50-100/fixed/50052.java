public java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> getKmlGeometryObject() {
    java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> coordinates = new java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>>();
    coordinates.add(mOuterBoundaryCoordinates);
    if ((mInnerBoundaryCoordinates) != null) {
        coordinates.addAll(mInnerBoundaryCoordinates);
    }
    return coordinates;
}