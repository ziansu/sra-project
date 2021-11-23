@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    setRetainInstance(true);
    edu.seattleu.elarson.moviedatabase.MovieDatabaseHelper movieDatabaseHelper = new edu.seattleu.elarson.moviedatabase.MovieDatabaseHelper(this.getActivity());
    mCursor = movieDatabaseHelper.queryMovies();
    edu.seattleu.elarson.moviedatabase.MovieListFragment.MovieCursorAdapter movieCursorAdapter = new edu.seattleu.elarson.moviedatabase.MovieListFragment.MovieCursorAdapter(this.getActivity(), mCursor);
    setListAdapter(movieCursorAdapter);
}