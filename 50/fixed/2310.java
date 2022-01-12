private void setupSearchView(android.view.MenuItem searchItem) {
    android.support.v7.widget.SearchView searchView = ((android.support.v7.widget.SearchView) (android.support.v4.view.MenuItemCompat.getActionView(searchItem)));
    this.searchView = searchView;
    searchView.setOnQueryTextListener(this);
    searchView.setSubmitButtonEnabled(false);
}