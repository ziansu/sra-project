public void onTap_one(android.view.View v) {
    com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_one = (com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_one) + 1;
    android.widget.TextView textViewOne = ((android.widget.TextView) (findViewById(R.id.score_one)));
    textViewOne.setText(java.lang.String.valueOf(com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_one));
    if (checkScore(com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_one)) {
        com.bugsnguns.asprokopov.tapattack.BattleActivity.winner = 1;
        android.content.Intent intent = new android.content.Intent(this, com.bugsnguns.asprokopov.tapattack.WinnerActivity.class);
        startActivity(intent);
    }
}