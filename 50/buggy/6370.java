private void showSuggestions() {
    if (((mAdapter) != null) && ((mAdapter.getCount()) > 0)) {
        mSuggestionsListView.setVisibility(View.VISIBLE);
    }
}