private void persistClassicGame() {
    int tempVictories = persist.getInt(getString(R.string.achievements_persist_classic), 0);
    tempVictories += 1;
    android.content.SharedPreferences.Editor editor = persist.edit();
    editor.putInt(getString(R.string.achievements_persist_classic), tempVictories);
    editor.apply();
}