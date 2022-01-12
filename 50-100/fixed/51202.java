@java.lang.Override
public void run() {
    com.stxnext.intranet2.adapter.AbsencesListAdapter absencesListAdapter = new com.stxnext.intranet2.adapter.AbsencesListAdapter(context, absenceEmployees, type, this);
    recycleView.setAdapter(absencesListAdapter);
    callback.onAbsencesDownloaded(type);
    if (swipeRefreshView.isRefreshing()) {
        swipeRefreshView.setRefreshing(false);
    }
}