private void endRound() {
    android.widget.Toast toast = new android.widget.Toast(this);
    toast.makeText(this, "TIMES UP! NEXT PLAYER", Toast.LENGTH_LONG);
    gameOn = false;
    (playerTurn)++;
    if ((playerTurn) >= (players.size())) {
        playerTurn = 0;
    }
    activePlayer.setText(("PLAYER: " + (players.get(playerTurn).getName())));
    start.setVisibility(View.VISIBLE);
    word.setText("Word");
}