public void openSearch() {
    if (isSearchViewOpen) {
        return ;
    }
    searchEditText.setText("");
    searchEditText.requestFocus();
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        rootView.setVisibility(View.VISIBLE);
        com.dat.floatingsearchviewdemo.AnimationUtils.circleRevealView(rootView);
        com.dat.floatingsearchviewdemo.AnimationUtils.circleRevealView(searchBar);
    }else {
        com.dat.floatingsearchviewdemo.AnimationUtils.fadeInView(rootView);
    }
    if ((searchViewListener) != null) {
        searchViewListener.onSearchViewOpen();
    }
    isSearchViewOpen = true;
}