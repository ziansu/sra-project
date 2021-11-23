public void update(com.tnt.scoreboard.models.Game game) {
    mRecyclerView.setAdapter(new com.tnt.scoreboard.adapters.InfoAdapter(game));
}