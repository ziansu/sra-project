@java.lang.Override
public void onClick(android.view.View view) {
    if (isFavorite) {
        fab.setImageResource(R.drawable.star_outline);
        realm.beginTransaction();
        realmCurrFavMovie.deleteFromRealm();
        realm.commitTransaction();
        isFavorite = false;
    }else {
        fab.setImageResource(R.drawable.star_pressed);
        realm.beginTransaction();
        final com.example.philoniare.popularmovies.model.FavoriteMovie favMovie = realm.copyToRealm(currFavMovie);
        realm.commitTransaction();
        isFavorite = true;
    }
}