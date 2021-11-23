@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    android.app.SearchManager searchManager = ((android.app.SearchManager) (getSystemService(Context.SEARCH_SERVICE)));
    android.widget.SearchView searchView = ((android.widget.SearchView) (menu.findItem(R.id.action_search).getActionView()));
    searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
    return true;
}