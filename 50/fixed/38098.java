private void showSuggestList() {
    if ((mSearchLayout.getVisibility()) == (android.view.View.GONE)) {
        mSearchLayout.setVisibility(View.VISIBLE);
        mRecyclerView.setLayoutFrozen(true);
    }
}