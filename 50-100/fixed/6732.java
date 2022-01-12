public void showSearch(boolean animate) {
    if (isSearchOpen()) {
        return ;
    }
    searchEditText.requestFocus();
    shadowView.setVisibility(View.VISIBLE);
    setVisibility(View.VISIBLE);
    if (animate) {
        setVisibleWithAnimation();
    }else {
        setVisibility(com.radiationpressure.mickhardins.mtgrecall.searchview.VISIBLE);
    }
    isSearchOpen = true;
}