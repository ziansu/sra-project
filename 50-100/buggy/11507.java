@java.lang.Override
public com.google.android.gms.maps.model.MarkerOptions map(com.task.vasskob.googlemaps.screens.map.model.Marker data) {
    com.google.android.gms.maps.model.LatLng markerLatLng = new com.google.android.gms.maps.model.LatLng(data.getLatitude(), data.getLongitude());
    android.util.Log.d(com.task.vasskob.googlemaps.screens.common.model.mapper.MarkerToMarkerOptionsMapper.TAG, ("map: marker id = " + (data.getTitle())));
    com.google.android.gms.maps.model.BitmapDescriptor markerIcon = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(data.getMarkerIcon().getResId());
    return new com.google.android.gms.maps.model.MarkerOptions().position(markerLatLng).title(data.getTitle()).icon(markerIcon);
}