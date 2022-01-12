public void doSearch() {
    CommonData.currentSearchOption.setPageToken("");
    mRvResults.removeAllViews();
    listResults.clear();
    mAdapter.notifyDataSetChanged();
    mLlLoadingResult.setVisibility(View.VISIBLE);
    com.dqhuynh.gplace.fragment.SearchFragment.SearchTask task = new com.dqhuynh.gplace.fragment.SearchFragment.SearchTask();
    task.execute(CommonData.currentSearchOption);
}