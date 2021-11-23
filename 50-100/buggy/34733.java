private void saveTagAndRefreshUI() {
    java.lang.String searchQuery = getSearchQueryEditText().getText().toString();
    java.lang.String tag = getTagSearchQueryEditText().getText().toString();
    boolean isTagAlreadyPresent = isTagAlreadyPresent(tag);
    android.content.SharedPreferences.Editor preferencesEditor = savedSearches.edit();
    preferencesEditor.putString(tag, searchQuery);
    preferencesEditor.apply();
    if (isTagAlreadyPresent) {
        refreshTagList(tag);
    }
}