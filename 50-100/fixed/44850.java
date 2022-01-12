@java.lang.Override
protected void onStart() {
    super.onStart();
    android.content.SharedPreferences sharedPreferences = getSharedPreferences(SharedPreferenceInfo.PREFS_NAME, com.jets.mashaweer.MODE_PRIVATE);
    java.lang.String authorized = sharedPreferences.getString(SharedPreferenceInfo.USER_ID, null);
    if (authorized == null) {
        intent = new android.content.Intent(this, com.jets.mashaweer.LoginActivity.class);
    }else {
        intent = new android.content.Intent(this, com.jets.mashaweer.HomeActivity.class);
    }
    startActivity(intent);
    finish();
}