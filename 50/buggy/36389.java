private void initSwipeRefreshLayout() {
    mSwipeRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (getActivity().findViewById(R.id.swiperefreshlayout)));
    mSwipeRefreshLayout.setColorSchemeResources(R.color.colorBlue, R.color.colorPrimaryDark, R.color.colorPrimary);
    mSwipeRefreshLayout.setOnRefreshListener(this);
}