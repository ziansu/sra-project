@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.content.Intent intent = new com.google.android.gms.location.places.ui.PlaceAutocomplete.IntentBuilder(com.google.android.gms.location.places.ui.PlaceAutocomplete.MODE_FULLSCREEN).setFilter(new com.google.android.gms.location.places.AutocompleteFilter.Builder().setCountry("BR").build()).build(this);
        startActivityForResult(intent, com.bdb.bikedeboa.util.Constants.PLACE_AUTOCOMPLETE_REQUEST_CODE);
    } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e) {
    } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
    }
}