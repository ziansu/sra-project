public void initialise() {
    android.content.SharedPreferences settings = getSharedPreferences("prefs_settings", 0);
    gameplayclass.lives = settings.getInt("lives", 7);
    android.widget.TextView lives_view = ((android.widget.TextView) (findViewById(R.id.in_game_lives)));
    lives_view.setText(("Lives: " + (gameplayclass.lives)));
    gameplayclass.initiate_blank_spaces(this);
}