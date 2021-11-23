@android.support.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.HONEYCOMB)
@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.database.Cursor cursor = ((android.database.Cursor) (parent.getItemAtPosition(position)));
    com.udacity.movie.model.MovieInfo movieInfo;
    if (cursor != null) {
        movieInfo = com.udacity.movie.model.MovieInfo.getMovieInfo(cursor);
        ((com.udacity.movie.fragment.MainFragment.MovieItemClickCallback) (getActivity())).onItemSelected(movieInfo);
    }
    mPosition = position;
}