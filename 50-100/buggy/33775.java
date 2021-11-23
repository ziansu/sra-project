private void setUpRecyclerView() {
    postList = new java.util.ArrayList<>();
    feedAdapter = new com.yueyang.travel.view.adapter.FeedAdapter(getContext(), postList);
    final android.support.v7.widget.LinearLayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    feedRecycler.setLayoutManager(layoutManager);
    feedRecycler.setAdapter(feedAdapter);
    android.view.View view = android.view.LayoutInflater.from(getActivity()).inflate(R.layout.null_content_remind, container);
    feedRecycler.setEmptyView(view);
}