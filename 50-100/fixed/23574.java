@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.menu, menu);
    android.view.MenuItem searchItem = menu.findItem(R.id.search);
    android.app.SearchManager searchManager = ((android.app.SearchManager) (getActivity().getSystemService(Context.SEARCH_SERVICE)));
    searchView = ((android.widget.SearchView) (android.support.v4.view.MenuItemCompat.getActionView(searchItem)));
    searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
    super.onCreateOptionsMenu(menu, inflater);
}