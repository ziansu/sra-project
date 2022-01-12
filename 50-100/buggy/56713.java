@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviesAdapter = new com.example.android.popularmovies.MoviesPosterAdapter(getActivity(), new java.util.ArrayList<com.example.android.popularmovies.Movie>());
    if ((savedInstanceState == null) || (!(savedInstanceState.containsKey("movies")))) {
        showMoviePoster();
    }else {
        moviesAdapter.moviesData = savedInstanceState.getParcelableArrayList("movies");
    }
}