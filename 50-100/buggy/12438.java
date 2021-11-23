private void saveSettings() {
    android.util.Log.i("....", "Title page activity saved");
    android.content.SharedPreferences settings = getSharedPreferences(MainMenuActivity.PREFS_NAME, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putString("activity", "title_page");
    editor.putString("story", story.getUniqueID());
    editor.commit();
}