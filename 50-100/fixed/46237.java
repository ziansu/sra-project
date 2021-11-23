public static com.door43.translationstudio.core.TranslationViewMode getLastViewMode(java.lang.String targetTranslationId) {
    android.content.SharedPreferences prefs = com.door43.translationstudio.App.sInstance.getSharedPreferences(com.door43.translationstudio.App.PREFERENCES_NAME, Context.MODE_PRIVATE);
    try {
        java.lang.String modeName = prefs.getString(((com.door43.translationstudio.App.LAST_VIEW_MODE) + targetTranslationId), TranslationViewMode.READ.name());
        return com.door43.translationstudio.core.TranslationViewMode.valueOf(modeName.toUpperCase());
    } catch (java.lang.Exception e) {
    }
    return com.door43.translationstudio.core.TranslationViewMode.READ;
}