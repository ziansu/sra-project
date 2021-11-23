@java.lang.Override
public boolean onQueryTextChange(java.lang.String query) {
    mCataloguePresenter.onQueryTextChange(query.trim());
    return true;
}