public void showSearch(boolean animate) {
    if (isSearchOpen()) {
        return ;
    }
    searchEditText.getText().clear();
    searchEditText.requestFocus();
    shadowView.setVisibility(View.VISIBLE);
    setVisibility(View.VISIBLE);
    if (animate) {
        setVisibleWithAnimation();
    }else {
        setVisibility(com.radiationpressure.mickhardins.mtgrecall.searchview.VISIBLE);
        if ((mSearchViewListener) != null) {
            mSearchViewListener.onSearchViewShown();
        }
    }
    isSearchOpen = true;
}