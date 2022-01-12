private void placePickerProcess(android.content.Intent data) {
    java.lang.System.out.println("AddPlaceActivity.placePickerProcess");
    com.google.android.gms.location.places.Place place = com.google.android.gms.location.places.ui.PlacePicker.getPlace(this, data);
    java.lang.System.out.println("AddPlaceActivity.placePickerProcess...");
    java.lang.String toastMsg = java.lang.String.format("Place: %s, Coords: %s", place.getName(), place.getLatLng());
    android.widget.Toast.makeText(this, toastMsg, Toast.LENGTH_LONG).show();
    java.lang.System.out.println("AddPlaceActivity.placePickerProcess......");
}