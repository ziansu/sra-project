public void skip(android.view.View view) {
    android.content.SharedPreferences settings = getSharedPreferences("Onboarding_Preferences", 0);
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putBoolean("onboarded", true);
    editor.apply();
    startActivity(new android.content.Intent(this, com.sushshring.familyfirst.Activities.MainActivity.class));
    finish();
}