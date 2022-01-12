@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == (org.softeg.slartus.forpdaplus.prefs.PreferencesActivity.PrefsFragment.MY_INTENT_CLICK)) {
            if (null == data)
                return ;
            
            android.net.Uri selectedImageUri = data.getData();
            java.lang.String selectedImagePath = org.softeg.slartus.forpdaplus.classes.ImageFilePath.getPath(getApplicationContext(), selectedImageUri);
            org.softeg.slartus.forpdaplus.App.getInstance().getPreferences().edit().putString("userInfoBg", selectedImagePath).putBoolean("isUserBackground", true).apply();
        }
    }
}