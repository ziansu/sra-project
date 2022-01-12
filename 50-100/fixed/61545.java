@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if (((pArray) != null) && ((marker.getTitle()) != null)) {
        for (app.com.project.csmith.finalyearproject.Places place : pArray) {
            if (marker.getTitle().equals(place.getName())) {
                setCurrentPlace(place);
            }
        }
    }
    return false;
}