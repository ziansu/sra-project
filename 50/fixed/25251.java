@java.lang.Override
public void onPlaceSelected(com.google.android.gms.location.places.Place place) {
    vacationLatitude = place.getLatLng().latitude;
    vacationLongitude = place.getLatLng().longitude;
}