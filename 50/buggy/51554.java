private void displayPlaces(com.gaborbiro.foodie.provider.places.model.places.Place[] places) {
    synchronized(mMap) {
        mMap.clear();
        mMarkerMap = com.gaborbiro.foodie.ui.adapter.PlaceListAdapter.adapt(places, mMap);
    }
}