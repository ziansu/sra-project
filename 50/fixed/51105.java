@java.lang.Override
public void run() {
    assignData(movie, state);
    updateMovieDetails(movie);
    movieDbHelper.update(currentMovie);
}