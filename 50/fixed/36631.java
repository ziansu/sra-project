private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    mTrendingAnthology = com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState);
    mTrendingAdapter = new com.jparkie.givesmehope.views.adapters.TrendingAdapter(mTrendingAnthology.getStories());
    mTrendingView.setAdapterForRecyclerView(mTrendingAdapter);
}