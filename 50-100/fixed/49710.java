@java.lang.Override
public void onResume() {
    super.onResume();
    java.lang.String preferenceSorting = sharedPreferences.getString(com.example.android.popularmovies.activity.MainActivity.PREF_SORTING_KEY, "");
    if ((!(preferenceSorting.equals(shownSortingPreference))) || ((moviesList) != null)) {
        android.util.Log.d(com.example.android.popularmovies.activity.MainActivity.TAG, "Sorting preference was changed.");
        loadMoviesData();
    }
}