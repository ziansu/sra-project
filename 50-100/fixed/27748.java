@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.glsebastiany.popularmovies.model.Film>> loader, java.util.List<com.glsebastiany.popularmovies.model.Film> data) {
    if ((data.size()) == 0) {
        setErrorState(getString(R.string.error_no_favorites));
    }else {
        postLoadSetStatus(data);
    }
}