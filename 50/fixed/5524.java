private void setupRecyclerView() {
    gridView.setLayoutManager(new android.support.v7.widget.GridLayoutManager(this, gridSize));
    adapter = new mobile.theopenvoicefactory.org.theopenvoicefactory.adapter.GridAdapter(this, mGrid, gridSize);
    gridView.setAdapter(adapter);
}