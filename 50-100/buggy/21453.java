@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((savedInstanceState != null) && (savedInstanceState.containsKey(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.MOVIES))) {
        position = savedInstanceState.getInt(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.POSITION);
        movies = savedInstanceState.getParcelableArrayList(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.MOVIES);
    }
}