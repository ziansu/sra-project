private void doSearch(java.lang.String query) {
    java.util.List mStops = mDataSource.searchByText(query);
    if ((mStops == null) || ((mStops.size()) == 0)) {
        mSearchNoResultsInfoFoundTextView.setText("Nenhum resultado encontrado!");
        mResultsAdapter.clear();
        return ;
    }
    mResultsAdapter.setQuery(query);
    mResultsAdapter.refresh(mStops);
}