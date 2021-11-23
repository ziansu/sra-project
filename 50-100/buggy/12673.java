public void deleteOldMarker(com.google.android.gms.maps.model.Marker marker) {
    if ((markers.get(viewHolder)) == null)
        markers.put(viewHolder, marker);
    else {
        markers.get(viewHolder).remove();
        distance -= currentDistance;
        duration -= currentDuration;
        markers.put(viewHolder, marker);
    }
}