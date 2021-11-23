private void hideSuggestList() {
    mRecyclerView.setVisibility(View.VISIBLE);
    mSearchLayout.setVisibility(View.GONE);
    mRecyclerView.setLayoutFrozen(false);
}