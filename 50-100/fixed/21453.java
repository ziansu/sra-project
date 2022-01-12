@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
        if (savedInstanceState.containsKey(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.MOVIES)) {
            movies = savedInstanceState.getParcelableArrayList(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.MOVIES);
        }
        if (savedInstanceState.containsKey(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.POSITION)) {
            position = savedInstanceState.getInt(com.udacity.jcmb.popularmovies.fragments.MoviesFragment.POSITION);
        }
    }
}