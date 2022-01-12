@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((savedInstanceState == null) || (!(savedInstanceState.containsKey("movie")))) {
        movieList = new java.util.ArrayList(java.util.Arrays.asList(mMovieLists));
    }else {
        movieList = savedInstanceState.getParcelableArrayList("movie");
    }
    setHasOptionsMenu(true);
}