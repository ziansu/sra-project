private void setRecyclerView() {
    if ((mColumnNumber) == 1) {
        android.support.v7.widget.LinearLayoutManager llm = new android.support.v7.widget.LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(llm);
        android.graphics.drawable.Drawable divider = getResources().getDrawable(R.drawable.padded_divider);
        mRecyclerView.addItemDecoration(new com.ilyarudyak.android.portfel.ui.divider.HorizontalDividerItemDecoration(divider));
    }else {
        android.support.v7.widget.GridLayoutManager glm = new android.support.v7.widget.GridLayoutManager(getActivity(), mColumnNumber);
        mRecyclerView.setLayoutManager(glm);
    }
    com.ilyarudyak.android.portfel.ui.NewsFragment.NewsFeedAdapter articleAdapter = new com.ilyarudyak.android.portfel.ui.NewsFragment.NewsFeedAdapter();
    mRecyclerView.setAdapter(articleAdapter);
}