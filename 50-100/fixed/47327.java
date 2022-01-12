private void updateFavourite(int position) {
    boolean isFavoritePlace;
    com.osh.apps.maps.place.Place place;
    place = adapter.getItem(position);
    isFavoritePlace = !(place.isFavourite());
    databaseManager.updatePlace(place.getId(), isFavoritePlace);
    if (isFavoritePlace) {
        homeActivityCallback.onAddFavouritePlace(new com.osh.apps.maps.place.Place(place));
    }else {
        homeActivityCallback.onRemoveFavouritePlace(this, place.getId());
    }
    place.setFavourite(isFavoritePlace);
    adapter.notifyItemChanged(position);
}