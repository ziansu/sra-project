@java.lang.Override
protected void onResume() {
    super.onResume();
    this.realm = io.realm.Realm.getDefaultInstance();
    java.util.List<com.chtv.korsoapp.Models.PlayerResult> results = realm.where(com.chtv.korsoapp.Models.Scoreboard.class).equalTo("scoreboardId", scoreBoardId).findFirst().getPlayerResults();
    com.chtv.korsoapp.adapters.PlayerResultListAdapter adapter = new com.chtv.korsoapp.adapters.PlayerResultListAdapter(results);
    scores.setAdapter(adapter);
    sessionName.setText(realm.where(com.chtv.korsoapp.Models.ContestSession.class).equalTo("contestSessionId", sessionId).findFirst().getName());
}