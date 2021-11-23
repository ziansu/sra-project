private void doSearch(java.lang.String query) {
    java.util.List results = mDataSource.searchByText(query);
    if ((results == null) || ((results.size()) == 0)) {
        mSearchNoResultsInfoFoundTextView.setText("Nenhum resultado encontrado!");
        mResultsAdapter.clear();
        return ;
    }
    mResultsAdapter.setQuery(query);
    mResultsAdapter.refresh(results);
}