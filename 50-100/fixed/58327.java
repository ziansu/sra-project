@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.launcher_menu, menu);
    mSearchMenu = menu.findItem(R.id.action_search);
    mSetLocationMenu = menu.findItem(R.id.action_set_location);
    mSearchView = ((android.support.v7.widget.SearchView) (mSearchMenu.getActionView()));
    android.app.SearchManager searchManager = ((android.app.SearchManager) (getSystemService(com.globalfriends.com.aroundme.ui.SEARCH_SERVICE)));
    mSearchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
    mSearchView.setIconified(true);
    return true;
}