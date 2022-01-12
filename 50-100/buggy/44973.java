public static void setLastViewMode(java.lang.String targetTranslationId, com.door43.translationstudio.core.TranslationViewMode viewMode) {
    android.content.SharedPreferences prefs = com.door43.translationstudio.App.sInstance.getSharedPreferences(com.door43.translationstudio.App.PREFERENCES_NAME, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString(((com.door43.translationstudio.App.LAST_VIEW_MODE) + targetTranslationId), viewMode.name());
    editor.apply();
}