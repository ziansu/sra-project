private void recordHighScore() {
    android.content.SharedPreferences settings = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putLong(com.narayan.a2048.MainGame.HIGH_SCORE, ((int) (highScore)));
    editor.commit();
}