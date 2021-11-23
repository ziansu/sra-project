private void saveSettings() {
    android.util.Log.i("....", "Story activity saved");
    android.content.SharedPreferences settings = getSharedPreferences(MainMenuActivity.PREFS_NAME, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putString("activity", "story_page");
    editor.putString("story", story.getUniqueID());
    editor.putInt("page", currentPage);
    editor.commit();
}