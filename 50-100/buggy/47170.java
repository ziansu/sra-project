@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.example.downloaderdemo.fragment.ArticleListFragment.sRecentSuggestions.clearHistory();
    com.example.downloaderdemo.fragment.ArticleListFragment.sRecentSuggestions = null;
    com.example.downloaderdemo.util.Utils.showSnackbar(getActivity().findViewById(R.id.coordinator_layout), "Search history cleared");
    com.example.downloaderdemo.util.QueryPreferences.setSavedPrefValue(getActivity(), QueryPreferences.QUERY_STRING, null);
    com.example.downloaderdemo.util.QueryPreferences.setSavedPrefValue(getActivity(), QueryPreferences.CURRENT_PAGE, null);
    timber.log.Timber.i("Cleared shared prefs & SearchView history");
}