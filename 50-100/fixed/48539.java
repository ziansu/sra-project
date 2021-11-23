@java.lang.Override
public void onFavoriteSheetEditDoneClick() {
    com.ludoscity.findmybikes.helpers.DBHelper.dropFavoriteAll(this);
    java.util.ArrayList<com.ludoscity.findmybikes.FavoriteItem> newlyOrderedFavList = new java.util.ArrayList<>();
    newlyOrderedFavList.addAll(mFavoriteRecyclerViewAdapter.getCurrentFavoriteList());
    java.util.Collections.reverse(newlyOrderedFavList);
    for (com.ludoscity.findmybikes.FavoriteItem fav : newlyOrderedFavList) {
        com.ludoscity.findmybikes.StationItem station = getStation(fav.getStationId());
        addFavorite(station, fav.getDisplayName(), true, false);
    }
}