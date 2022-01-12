private void setUpRecyclerView() {
    com.chernandezgil.farmacias.ui.adapter.item_animator.CustomItemAnimator customItemAnimator = new com.chernandezgil.farmacias.ui.adapter.item_animator.CustomItemAnimator();
    mAdapter = new com.chernandezgil.farmacias.ui.adapter.ListTabAdapter(this, mRecyclerView, customItemAnimator);
    mRecyclerView.setItemAnimator(customItemAnimator);
    mRecyclerView.setLayoutManager(new com.chernandezgil.farmacias.customwidget.ScrollerLinearLayoutManager(getActivity()));
    mRecyclerView.setHasFixedSize(true);
    mRecyclerView.setAdapter(mAdapter);
}