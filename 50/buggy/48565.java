@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    mapFragment.findMyLocation(googleClient);
    com.doo.study.dytransit.view.adapter.PlaceAutocompleteAdapter adapter = new com.doo.study.dytransit.view.adapter.PlaceAutocompleteAdapter(this, R.layout.auto_view_row);
    adapter.setGoogleApiClient(googleClient);
    searchView.setAdapter(adapter);
}