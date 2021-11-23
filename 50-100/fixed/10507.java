private void pickPlace() {
    com.google.android.gms.location.places.ui.PlacePicker.IntentBuilder builder = new com.google.android.gms.location.places.ui.PlacePicker.IntentBuilder();
    try {
        startActivityForResult(builder.build(this), com.arman.horus.activities.AddPlaceActivity.PLACE_PICKER_REQUEST);
    } catch (com.google.android.gms.common.GooglePlayServicesRepairableException | com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
        e.printStackTrace();
        android.widget.Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
    }
}