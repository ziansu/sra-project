private void addCity() {
    try {
        com.google.android.gms.location.places.AutocompleteFilter typeFilter = new com.google.android.gms.location.places.AutocompleteFilter.Builder().setTypeFilter(AutocompleteFilter.TYPE_FILTER_CITIES).build();
        android.content.Intent intent = new com.google.android.gms.location.places.ui.PlaceAutocomplete.IntentBuilder(com.google.android.gms.location.places.ui.PlaceAutocomplete.MODE_OVERLAY).setFilter(typeFilter).build(this);
        startActivityForResult(intent, uk.me.feixie.coolweather.activity.MainActivity.PLACE_AUTOCOMPLETE_REQUEST_CODE);
    } catch (com.google.android.gms.common.GooglePlayServicesRepairableException | com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
        uk.me.feixie.coolweather.util.UIUtils.showToast(this, e.getMessage());
    }
}