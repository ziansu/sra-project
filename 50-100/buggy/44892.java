public void updateHS(int x) {
    android.content.SharedPreferences mypreferences = getSharedPreferences("App_preferences_file", Context.MODE_PRIVATE);
    int currentHS = mypreferences.getInt("highscore", 0);
    if ((userScore) > currentHS) {
        android.content.SharedPreferences.Editor editor = mypreferences.edit();
        editor.putInt("highscore", x);
        editor.commit();
        android.widget.Toast.makeText(getApplicationContext(), "New High Score!", Toast.LENGTH_LONG).show();
        endGame();
    }else {
        endGame();
    }
}