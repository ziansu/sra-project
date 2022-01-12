public java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> getKmlGeometryObject() {
    java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> coordinates = new java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>>();
    coordinates.add(mOuterBoundaryCoordinates);
    coordinates.addAll(mInnerBoundaryCoordinates);
    return coordinates;
}