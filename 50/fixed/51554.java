private void displayPlaces(com.gaborbiro.foodie.provider.places.model.places.Place[] places) {
    synchronized(mMap) {
        com.gaborbiro.foodie.ui.adapter.PlaceListAdapter.clear(mMap);
        mMarkerMap = com.gaborbiro.foodie.ui.adapter.PlaceListAdapter.adapt(places, mMap);
    }
}