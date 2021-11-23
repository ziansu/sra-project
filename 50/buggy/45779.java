@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.github.codetanzania.ui.activity.SettingsActivity.EDIT_PROFILE_REQUEST)) {
        updateUserProfile();
        mayChangeDefaultLanguage(data.getBooleanExtra(EditUserProfileActivity.FLAG_LANGUAGE_CHANGED, false));
    }
}