private void populateRv(java.util.List<com.example.mjokic.quizapp.model.Score> scores, com.example.mjokic.quizapp.model.User user) {
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerViewHS)));
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    com.example.mjokic.quizapp.adapters.RecycleViewHighscoreAdapter recycleViewAdapter = new com.example.mjokic.quizapp.adapters.RecycleViewHighscoreAdapter(this, scores, user);
    recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.setAdapter(recycleViewAdapter);
    findViewById(R.id.hs_spinning_loader).setVisibility(View.INVISIBLE);
    recyclerView.setVisibility(View.VISIBLE);
}