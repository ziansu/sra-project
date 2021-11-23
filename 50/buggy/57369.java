private void setAdapter(java.lang.String country) {
    android.content.Intent placesListIntent = new android.content.Intent(this, ru.belogurowdev.yourplaces.Activity.PlacesListActivity.class);
    placesListIntent.putExtra("COUNTRY", country);
    mAdapter = new ru.belogurowdev.yourplaces.Adapter.PlaceTypesAdapter(this, placesListIntent, mPlaceTypes);
}