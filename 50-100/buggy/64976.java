@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((!(mAdapter.hasSearchText())) || (mAdapter.hasNewSearchText(newText))) {
        android.util.Log.d(eu.davidea.samples.flexibleadapter.MainActivity.TAG, ("onQueryTextChange newText: " + newText));
        mAdapter.setSearchText(newText);
        mAdapter.filterItems(eu.davidea.samples.flexibleadapter.services.DatabaseService.getInstance().getDatabaseList(), 450L);
    }
    mSwipeRefreshLayout.setEnabled((!(mAdapter.hasSearchText())));
    return true;
}