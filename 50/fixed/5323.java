@java.lang.Override
public void run() {
    mAdapter = new com.nathanromike.yes_you_can.adapters.GuideListAdapter(getContext(), mGuides);
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getContext());
    mRecyclerView.setAdapter(mAdapter);
    mRecyclerView.setLayoutManager(layoutManager);
}