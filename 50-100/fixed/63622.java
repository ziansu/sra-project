private void setup() {
    android.widget.FrameLayout layout = ((android.widget.FrameLayout) (android.view.LayoutInflater.from(getContext()).inflate(R.layout.view_debugview, this, true)));
    setNestedScrollingEnabled(true);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (layout.findViewById(R.id.recycler_view)));
    mRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    mRecyclerView.setNestedScrollingEnabled(true);
}