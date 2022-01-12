@java.lang.Override
public void onStart() {
    super.onStart();
    android.content.SharedPreferences sharedPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String sortByPref = sharedPrefs.getString(getString(R.string.pref_movies_sort_by_key), getString(R.string.pref_movies_sort_by_popularity));
    if (!(mSortBy.equals(sortByPref))) {
        mSortBy = sortByPref;
        new com.erlantzoniga.androidnanodegree.MoviesActivityFragment.FetchMoviesTask().execute(sortByPref);
    }
}