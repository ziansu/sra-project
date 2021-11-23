@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if (((movies) != null) && (!(movies.isEmpty()))) {
        outState.putParcelableArrayList(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.MOVIES, movies);
    }
    if ((position) != (-1)) {
        outState.putInt(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.POSITION, position);
    }
    super.onSaveInstanceState(outState);
}