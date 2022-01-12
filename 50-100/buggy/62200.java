private boolean isFirstTime() {
    android.content.SharedPreferences preferences = getPreferences(com.example.selection_test1.MODE_PRIVATE);
    boolean ranBefore = preferences.getBoolean("WHOVA", false);
    if (!ranBefore) {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("PeopleSelectionTutorial", true);
        editor.commit();
    }
    return !ranBefore;
}