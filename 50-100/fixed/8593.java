@java.lang.Override
public void onClick(android.view.View view) {
    if (isFavorite[0]) {
        mDatabaseReferenceFavs.child(trip.getId()).removeValue();
        unfavoriteTrip(viewHolder.ivFavorite);
        isFavorite[0] = false;
    }else {
        mDatabaseReferenceFavs.child(trip.getId()).setValue(trip);
        favoriteTrip(viewHolder.ivFavorite);
        isFavorite[0] = true;
    }
}