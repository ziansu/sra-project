@java.lang.Override
public void getMoreInfoWorkHistoryTime(java.util.List<com.hbbsolution.owner.history.model.workhistory.WorkHistory> listWorkHistory, java.lang.String startAt, java.lang.String endAt) {
    mDocList.addAll(listWorkHistory);
    (currentPageTime)++;
    historyJobAdapter.notifyDataSetChanged();
    recyclerView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            historyJobAdapter.notifyItemRangeInserted(historyJobAdapter.getItemCount(), ((mDocList.size()) - 1));
        }
    });
}