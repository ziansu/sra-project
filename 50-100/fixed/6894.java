@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu, menu);
    android.support.v7.widget.SearchView searchView = ((android.support.v7.widget.SearchView) (android.support.v4.view.MenuItemCompat.getActionView(menu.findItem(R.id.action_search))));
    android.app.SearchManager searchManager = ((android.app.SearchManager) (getSystemService(com.example.karthik.listview.SEARCH_SERVICE)));
    searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
    searchView.setOnQueryTextListener(this);
    return true;
}