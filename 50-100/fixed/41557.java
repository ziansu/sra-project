@java.lang.Override
public void doSearch(com.example.jedgar.spca.SearchCriteria sc) {
    android.util.Log.d("main", "je cherche");
    android.support.v4.app.Fragment frag = com.example.jedgar.spca.BrowsePageFragment.newInstance();
    getIntent().putExtra("SearchCriteria", sc);
    getIntent().putExtra("sender", DBHelper.CURSOR_NAME_SEARCH_ANIMALS);
    fragmentManager.beginTransaction().replace(R.id.container, frag, DBHelper.CURSOR_NAME_SEARCH_ANIMALS).addToBackStack(null).commit();
    mTitle = getString(R.string.searchResultsTitle);
    restoreActionBar();
}