private void changePlayer() {
    if (isFirstPlayer) {
        android.util.Log.i("changePlayer: ", "to secondPlayer");
        playerScoreText2.setTextColor(Color.RED);
        playerScoreText1.setTextColor(Color.BLACK);
    }else {
        android.util.Log.i("changePlayer: ", "to firstPlayer");
        playerScoreText1.setTextColor(Color.RED);
        playerScoreText2.setTextColor(Color.BLACK);
    }
    isFirstPlayer = !(isFirstPlayer);
}