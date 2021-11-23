private void savePreferences() {
    android.content.SharedPreferences.Editor editor = context.getSharedPreferences("Settings", android.content.Context.MODE_PRIVATE).edit();
    editor.putBoolean("music", musicOn);
    editor.apply();
}