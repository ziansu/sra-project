private void swapLayoutManager() {
    gridView = !(gridView);
    android.support.v7.widget.RecyclerView.LayoutManager manager = (gridView) ? new android.support.v7.widget.GridLayoutManager(getActivity(), 3) : new android.support.v7.widget.LinearLayoutManager(getActivity());
    android.support.v7.widget.RecyclerView.Adapter adapter = (gridView) ? new com.gustavosilvadesousa.etflickr.ui.PhotoGridAdapter(photos) : new com.gustavosilvadesousa.etflickr.ui.PhotoRowAdapter(photos);
    mRecyclerView.setLayoutManager(manager);
    mRecyclerView.swapAdapter(adapter, false);
}