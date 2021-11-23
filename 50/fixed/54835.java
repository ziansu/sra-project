private void setUpRecyclerView() {
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    recyclerView.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    recyclerView.setAdapter(adapter);
}