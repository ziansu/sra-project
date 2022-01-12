private void onGameEnd(int Score, int difficulty) {
    android.content.Intent endGame = new android.content.Intent(this, com.twotowerstudios.clickr.PostGameScreen.class);
    endGame.putExtra("score", Score);
    endGame.putExtra("difficulty", difficulty);
    startActivity(endGame);
}