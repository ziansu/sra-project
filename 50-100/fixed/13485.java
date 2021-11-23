private void initializeEventSummaryView() {
    eventSummaryView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.event_summary_list)));
    eventSummaryView.setHasFixedSize(true);
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    eventSummaryView.setLayoutManager(layoutManager);
    adapter = new edu.washington.ischool.commoncents.commoncents.adapters1.UsersListAdapter(this, this, edu.washington.ischool.commoncents.commoncents.AppState.getCurrentState().getSelectedEvent().getUsersInvolved());
    eventSummaryView.setAdapter(adapter);
}