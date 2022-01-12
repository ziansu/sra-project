public void swapMovies(java.util.ArrayList<developer.montero.michael.com.popularmovies.model.Movie> mMovies) {
    if ((((movies) != null) && ((movies.size()) > 0)) && (mMovies != null)) {
        movies.addAll(mMovies);
    }else {
        movies = mMovies;
    }
    notifyDataSetChanged();
}