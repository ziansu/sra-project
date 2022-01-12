private void persistClassicGame(int victories) {
    int tempVictories = persist.getInt(getString(R.string.achievements_persist_classic), 0);
    tempVictories += victories;
    android.content.SharedPreferences.Editor editor = persist.edit();
    editor.putInt(getString(R.string.achievements_persist_classic), tempVictories);
    editor.apply();
}