public void onNewGame(android.view.View v) {
    BattleActivity.score_player_one = 0;
    BattleActivity.score_player_two = 0;
    BattleActivity.winner = 0;
    android.content.Intent intent = new android.content.Intent(this, com.bugsnguns.asprokopov.tapattack.ChooseTargetActivity.class);
    startActivity(intent);
}