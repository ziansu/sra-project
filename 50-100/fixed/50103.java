@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    if ((savedInstanceState != null) && (savedInstanceState.containsKey("movies"))) {
        movies = savedInstanceState.getParcelableArrayList("movies");
    }else {
        fetchMovieData();
    }
    super.onCreate(savedInstanceState);
}