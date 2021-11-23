private void initViews() {
    recyclerView1 = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.trailerList)));
    trailerList = new java.util.ArrayList<>();
    trailerAdapter = new com.app.phedev.popmovie.adapter.TrailerAdapter(this, trailerList);
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getApplicationContext());
    recyclerView1.setLayoutManager(layoutManager);
    loadJSON();
}