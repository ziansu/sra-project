public void onTap_two(android.view.View v) {
    com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_two = (com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_two) + 1;
    android.widget.TextView textViewTwo = ((android.widget.TextView) (findViewById(R.id.score_two)));
    textViewTwo.setText(java.lang.String.valueOf(com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_two));
    if (checkScore(com.bugsnguns.asprokopov.tapattack.BattleActivity.score_player_two)) {
        com.bugsnguns.asprokopov.tapattack.BattleActivity.winner = 2;
        android.content.Intent intent = new android.content.Intent(this, com.bugsnguns.asprokopov.tapattack.WinnerActivity.class);
        startActivity(intent);
    }
}