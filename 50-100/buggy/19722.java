@java.lang.Override
public void getMoreInfoWorkHistory(java.util.List<com.hbbsolution.owner.history.model.workhistory.WorkHistory> listWorkHistory) {
    mDocList.addAll(listWorkHistory);
    (currentPage)++;
    historyJobAdapter.notifyDataSetChanged();
    recyclerView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            historyJobAdapter.notifyItemRangeInserted(historyJobAdapter.getItemCount(), ((mDocList.size()) - 1));
        }
    });
}