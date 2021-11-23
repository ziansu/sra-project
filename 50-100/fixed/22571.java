@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.pokescanner.settings.SettingsFragment.CUSTOM_LOCATION_REQUEST)) {
        if ((resultCode == (android.app.Activity.RESULT_OK)) && (data != null)) {
            com.google.android.gms.location.places.Place place = com.google.android.gms.location.places.ui.PlacePicker.getPlace(mContext, data);
            com.pokescanner.settings.Settings.setCustomLocation(mContext, place.getLatLng());
            custom_location.setSummary(place.getLatLng().toString());
        }
    }
}