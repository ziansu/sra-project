@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.database.Cursor cursor = ((android.database.Cursor) (parent.getItemAtPosition(position)));
    int movieId = cursor.getInt(com.example.jamie.popularmovies.fragments.MainMovieFragment.COL_MOVIE_ID);
    android.net.Uri uri = MovieContract.MovieEntry.buildMovieUri(movieId);
    com.example.jamie.popularmovies.fragments.MainMovieFragment.mPosition = position;
    ((com.example.jamie.popularmovies.fragments.MainMovieFragment.SetPositionCallBack) (getActivity())).setPosition(com.example.jamie.popularmovies.fragments.MainMovieFragment.mPosition);
    ((com.example.jamie.popularmovies.fragments.MainMovieFragment.Callback) (getActivity())).onItemSelected(uri);
}