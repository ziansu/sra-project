private void inflateLayout() {
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(R.id.recycler_view)));
    recyclerView.setHasFixedSize(true);
    _sGridLayoutManager = new android.support.v7.widget.StaggeredGridLayoutManager(3, android.support.v7.widget.StaggeredGridLayoutManager.VERTICAL);
    recyclerView.setLayoutManager(_sGridLayoutManager);
    java.util.List<com.sunway.android.memoapp.model.MemoItem> sList;
    sList = com.sunway.android.memoapp.util.ListOperation.getListViewItems();
    com.sunway.android.memoapp.model.MemoItemAdapter rcAdapter = new com.sunway.android.memoapp.model.MemoItemAdapter(getActivity(), sList);
    recyclerView.setAdapter(rcAdapter);
}