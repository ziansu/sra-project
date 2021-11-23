private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    mHotAnthology = com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState);
    mHotAdapter = new com.jparkie.givesmehope.views.adapters.HotAdapter(mHotView.getContext(), mHotAnthology.getStories());
    mHotView.setAdapterForRecyclerView(mHotAdapter);
}