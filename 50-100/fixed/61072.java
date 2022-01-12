private void placePickerProcess(android.content.Intent data) {
    com.google.android.gms.location.places.Place place = com.google.android.gms.location.places.ui.PlacePicker.getPlace(this, data);
    java.lang.String toastMsg = java.lang.String.format("Place: %s, Coords: %s", place.getName(), place.getLatLng());
    android.widget.Toast.makeText(this, toastMsg, Toast.LENGTH_LONG).show();
}