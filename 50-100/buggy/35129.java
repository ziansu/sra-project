@java.lang.Override
public void onClick(android.view.View v) {
    edu.uw.lbaker7.localtravelapp.PlaceItem placeToDelete = adapter.getItem(position);
    adapter.remove(placeToDelete);
    deleteButton.setVisibility(View.INVISIBLE);
    android.util.Log.v(edu.uw.lbaker7.localtravelapp.fragments.ItineraryDetailFragment.TAG, ("I'm deleting this objectID: " + (placeIds.get(position))));
    edu.uw.lbaker7.localtravelapp.fragments.ItineraryDetailFragment.firebaseController.deletePlaceFromItinerary(placeIds.get(position), itineraryKey);
    placeIds.remove(position);
}