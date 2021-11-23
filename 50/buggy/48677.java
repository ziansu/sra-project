@java.lang.Override
public boolean onQueryTextChange(java.lang.String query) {
    mCataloguePresenter.onQueryTextChange(query);
    return true;
}