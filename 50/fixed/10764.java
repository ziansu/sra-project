@java.lang.Override
public void onClick(android.view.View v) {
    int index = dataset.indexOf(movie);
    db.deleteMovieFromWatchlist(movie.getId());
}