public void drawCondition() {
    createDialog(getString(R.string.draw));
    android.content.SharedPreferences sharedPref = getSharedPreferences("LevelScores", Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putInt(getIntent().getStringExtra("playerOne"), sharedPref.getInt(getIntent().getStringExtra("playerOne"), 0));
    editor.putInt(getIntent().getStringExtra("playerTwo"), sharedPref.getInt(getIntent().getStringExtra("playerTwo"), 0));
}