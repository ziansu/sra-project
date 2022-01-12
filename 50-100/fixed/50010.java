private void addListOfPoints(java.util.Iterator<ru.sukharev.pathtracker.utils.orm.MapPoint> iterator) {
    java.util.List<com.google.android.gms.maps.model.LatLng> newList = new java.util.ArrayList<>();
    while (iterator.hasNext())
        newList.add(iterator.next().toLatLng());
    
    updatePolyline(newList);
}