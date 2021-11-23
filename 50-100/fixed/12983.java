public static java.util.List<com.google.android.gms.maps.model.LatLng> convertToLatLng(java.util.List<casak.ru.geofencer.domain.model.Point> points) {
    int size = points.size();
    java.util.List<com.google.android.gms.maps.model.LatLng> result = new java.util.ArrayList<>(size);
    if (size == 0) {
        return result;
    }
    for (casak.ru.geofencer.domain.model.Point point : points) {
        result.add(casak.ru.geofencer.presentation.converters.LatLngConverter.convertToLatLng(point));
    }
    return result;
}