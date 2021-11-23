@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences.Editor editor = getSharedPreferences(com.ferit.dfundak.georeminder.MainActivity.MY_PREFS_NAME, com.ferit.dfundak.georeminder.MODE_PRIVATE).edit();
    editor.putBoolean("fromNotification", false);
    editor.commit();
}