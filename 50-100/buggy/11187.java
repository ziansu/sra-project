public void displayRecyclerView(boolean editable) {
    mPlayerRecyclerView.setVisibility(View.VISIBLE);
    mLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    mPlayerRecyclerView.setLayoutManager(mLayoutManager);
    mPlayerListAdapter = new io.github.sdsstudios.ScoreKeeper.Adapters.PlayerListAdapter(CURRENT_ACTIVITY, editable, mRelativeLayout, this);
    mPlayerRecyclerView.setAdapter(mPlayerListAdapter);
}