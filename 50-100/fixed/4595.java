@java.lang.Override
public void onCalled(java.util.ArrayList<com.johnsimon.payback.data.Debt> feed) {
    if ((recyclerView.getAdapter()) == null) {
        adapter = new com.johnsimon.payback.adapter.FeedListAdapter(feed, ((com.johnsimon.payback.core.DataActivity) (getActivity())), self, emptyView);
        recyclerView.setAdapter(adapter);
    }else {
        adapter.updateList(feed);
        adapter.notifyDataSetChanged();
    }
    adapter.checkAdapterIsEmpty();
}