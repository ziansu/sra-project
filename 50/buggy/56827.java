@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.util.Log.i("MainActivityFragment", "Spinner On Item Selected is chosen");
    updateSortingCriteriaPreference(i);
    updateMovies();
}