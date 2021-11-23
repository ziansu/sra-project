private void endRound() {
    android.widget.Toast toast = android.widget.Toast.makeText(this, "TIMES UP! NEXT PLAYER", Toast.LENGTH_LONG);
    toast.show();
    gameOn = false;
    (playerTurn)++;
    if ((playerTurn) >= (players.size())) {
        playerTurn = 0;
    }
    activePlayer.setText(("PLAYER: " + (players.get(playerTurn).getName())));
    start.setVisibility(View.VISIBLE);
    word.setText("Word");
}