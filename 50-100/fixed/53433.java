private void collide() {
    gameOver = true;
    android.content.SharedPreferences preferences = getApplicationContext().getSharedPreferences(GameSettings.KEY_SNAKE_PREFERENCES, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putInt("Score", playerScore);
    editor.commit();
    android.content.Intent intentScore = new android.content.Intent(this, com.bojie.snake_android_game.ClassicScore.class);
    intentScore.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
    startActivity(intentScore);
}