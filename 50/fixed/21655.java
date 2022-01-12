public boolean onQueryTextSubmit(java.lang.String query) {
    searchView.refreshDrawableState();
    list.setVisibility(View.GONE);
    createUsersSelectedFoods();
    return false;
}