public void updateMovies() {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String orderType = prefs.getString(getString(R.string.order), getString(R.string.pref_order_popular_movies));
    android.util.Log.v("WHAT", orderType);
    if (!(orderType.equals(getString(R.string.pref_order_popular_movies)))) {
        com.edbono.www.popularmovies.NetworkingFragment.order_popular_movies = false;
        android.util.Log.v("wecamehere", "wecamehere");
    }
    com.edbono.www.popularmovies.NetworkingFragment.NetworkingTask updateTask = new com.edbono.www.popularmovies.NetworkingFragment.NetworkingTask();
    updateTask.execute();
}