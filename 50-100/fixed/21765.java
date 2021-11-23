private void populateRv(java.util.List<com.example.mjokic.quizapp.model.Score> scores, java.util.List<com.example.mjokic.quizapp.model.User> users) {
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerViewLB)));
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    com.example.mjokic.quizapp.adapters.RecycleViewLeaderboardAdapter recycleViewLeaderboardAdapter = new com.example.mjokic.quizapp.adapters.RecycleViewLeaderboardAdapter(this, scores, users);
    recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.setAdapter(recycleViewLeaderboardAdapter);
    findViewById(R.id.lb_spinning_loader).setVisibility(View.INVISIBLE);
    recyclerView.setVisibility(View.VISIBLE);
}