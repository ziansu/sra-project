public void showMovieDetails(@android.support.annotation.Nullable
com.nanodegree.popularmovies.models.Movie movie) {
    if (!(mTwoPane)) {
        return ;
    }
    if (movie == null) {
        return ;
    }
    mSelectedMovie = movie;
    mDetailsFragment = com.nanodegree.popularmovies.fragments.MovieDetailsFragment.newInstance(movie, true);
    getSupportFragmentManager().beginTransaction().replace(R.id.details_fragment_container, mDetailsFragment, com.nanodegree.popularmovies.fragments.MovieDetailsFragment.class.getSimpleName()).commit();
}