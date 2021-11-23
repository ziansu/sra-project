@java.lang.Override
public void run() {
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getContext());
    mRecyclerView.setLayoutManager(layoutManager);
    mAdapter = new com.nathanromike.yes_you_can.adapters.GuideListAdapter(getContext(), mGuides);
    mRecyclerView.setAdapter(mAdapter);
}