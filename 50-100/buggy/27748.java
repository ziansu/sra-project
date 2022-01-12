@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    java.util.List<com.glsebastiany.popularmovies.model.Film> filmsFromCursor = com.glsebastiany.popularmovies.data.FilmsContentProviderCursorHelper.getFilmsFromCursor(data);
    if ((filmsFromCursor.size()) == 0) {
        setErrorState(getString(R.string.error_no_favorites));
    }else {
        postLoadSetStatus(filmsFromCursor);
    }
}