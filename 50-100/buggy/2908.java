public void doSearch() {
    CommonData.currentSearchOption.setPageToken("");
    listResults.clear();
    mAdapter.notifyDataSetChanged();
    mRvResults.removeAllViews();
    mLlLoadingResult.setVisibility(View.VISIBLE);
    com.dqhuynh.gplace.fragment.SearchFragment.SearchTask task = new com.dqhuynh.gplace.fragment.SearchFragment.SearchTask();
    task.execute(CommonData.currentSearchOption);
}