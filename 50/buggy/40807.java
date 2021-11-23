private void initUI() {
    setSupportActionBar(toolbar);
    listview.setAdapter(adapter);
    listview.setLayoutManager(new android.support.v7.widget.GridLayoutManager(this, 3));
    listview.addItemDecoration(decoration);
}