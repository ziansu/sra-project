private void setUpRecyclerView() {
    postList = new java.util.ArrayList<>();
    feedAdapter = new com.yueyang.travel.view.adapter.FeedAdapter(getContext(), postList);
    final android.support.v7.widget.LinearLayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    feedRecycler.setLayoutManager(layoutManager);
    feedRecycler.setAdapter(feedAdapter);
}