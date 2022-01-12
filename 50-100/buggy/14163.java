public void updateMovies() {
    if (isConnected()) {
        edu.boisestate.azamattulepbergenovu.popularmovies.fetch.FetchMovieDataTask task = new edu.boisestate.azamattulepbergenovu.popularmovies.fetch.FetchMovieDataTask(adapter, getActivity());
        android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this.getActivity());
        task.execute(prefs.getString(getString(R.string.settings_key), getString(R.string.settings_default_value)));
    }else {
        displayMessage(NO_INET_CONNECTION);
    }
}