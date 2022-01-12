private void setGrid() {
    layoutManager = new android.support.v7.widget.GridLayoutManager(activity, 2);
    recyclerView.setLayoutManager(layoutManager);
    com.rakesh.flickerproject.FlickerImageActivity.MyGridAdapter photoAdapter;
    photoAdapter = new com.rakesh.flickerproject.FlickerImageActivity.MyGridAdapter();
    recyclerView.setAdapter(photoAdapter);
}