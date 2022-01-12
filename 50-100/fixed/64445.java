@java.lang.Override
public void success(java.util.List<projet.istic.fr.firedrone.model.Resource> resources, retrofit.client.Response response) {
    if (resources != null) {
        for (projet.istic.fr.firedrone.model.Resource r : resources) {
            java.lang.System.out.println(r.getId());
            projet.istic.fr.firedrone.map.EnumPointType enumPointType = projet.istic.fr.firedrone.map.EnumPointType.valueOf(r.getType());
            com.google.android.gms.maps.model.Marker marker = addResourceOnMap(enumPointType, new com.google.android.gms.maps.model.LatLng(r.getLatitude(), r.getLongitude()));
            mapMarkerItem.put(marker, enumPointType);
        }
    }
}