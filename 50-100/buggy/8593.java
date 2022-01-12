@java.lang.Override
public void onClick(android.view.View view) {
    if (isFavorite) {
        mDatabaseReferenceFavs.child(trip.getId()).removeValue();
        unfavoriteTrip(viewHolder.ivFavorite);
    }else {
        mDatabaseReferenceFavs.child(trip.getId()).setValue(trip);
        favoriteTrip(viewHolder.ivFavorite);
    }
}