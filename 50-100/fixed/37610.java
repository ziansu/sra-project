public void start() {
    try {
        android.content.Intent intent = new com.google.android.gms.location.places.ui.PlaceAutocomplete.IntentBuilder(com.google.android.gms.location.places.ui.PlaceAutocomplete.MODE_OVERLAY).build(mActivity);
        mActivity.startActivityForResult(intent, com.comli.shapira.aroundme.ui_helpers.PlacesAutoComplete.REQUEST_SELECT_PLACE);
    } catch (java.lang.Exception e) {
        android.util.Log.e(MainActivity.LOG_TAG, ("" + (e.getMessage())));
    }
}