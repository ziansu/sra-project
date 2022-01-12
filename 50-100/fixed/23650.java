public void closeSearch(boolean animate) {
    if (!(isSearchOpen())) {
        return ;
    }
    clearFocus();
    hideKeyboard(searchEditText);
    searchEditText.setText(null);
    dismissSuggestions();
    if (animate) {
        setInvisibleWithAnimation();
    }
    shadowView.setVisibility(View.GONE);
    isSearchOpen = false;
}