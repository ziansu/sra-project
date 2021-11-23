private void showSuggestList() {
    if ((mSearchLayout.getVisibility()) == (android.view.View.GONE)) {
        mRecyclerView.setVisibility(View.GONE);
        mSearchLayout.setVisibility(View.VISIBLE);
        mRecyclerView.setLayoutFrozen(true);
    }
}