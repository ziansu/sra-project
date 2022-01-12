public void update(com.tnt.scoreboard.models.Game game) {
    if (game == null)
        mRecyclerView.setAdapter(null);
    else
        mRecyclerView.setAdapter(new com.tnt.scoreboard.adapters.InfoAdapter(game));
    
}