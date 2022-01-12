public void closeSearch(boolean animate) {
    if (!(isSearchOpen())) {
        return ;
    }
    clearFocus();
    hideKeyboard(searchEditText);
    searchEditText.getText().clear();
    dismissSuggestions();
    if (animate) {
        setInvisibleWithAnimation();
    }
    shadowView.setVisibility(View.GONE);
    if ((mSearchViewListener) != null) {
        mSearchViewListener.onSearchViewClosed();
    }
    isSearchOpen = false;
}