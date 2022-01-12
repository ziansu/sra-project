public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals("background")) {
        finish();
        android.content.Intent intent = new android.content.Intent(this, be.ecam.ticketing.ticketing_app.SettingsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}