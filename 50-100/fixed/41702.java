public void onClick(android.content.DialogInterface dialog, int which) {
    com.bsdsolutions.sanjaydixit.p2_popular_movies_app.MainActivityFragment.clearMovieList();
    com.bsdsolutions.sanjaydixit.p2_popular_movies_app.MainActivityFragment.mFavoritesView = false;
    if (which <= 1)
        com.bsdsolutions.sanjaydixit.p2_popular_movies_app.MainActivityFragment.updateMovieList((which == 0));
    else
        if (which == 2) {
            com.bsdsolutions.sanjaydixit.p2_popular_movies_app.MainActivityFragment.mFavoritesView = true;
            com.bsdsolutions.sanjaydixit.p2_popular_movies_app.MainActivityFragment.loadFavorites();
        }
    
}