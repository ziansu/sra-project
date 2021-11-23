public static void putEmailInSharedPref(java.lang.String email, android.app.Activity activity, java.lang.String provider) {
    android.content.SharedPreferences pref = activity.getApplicationContext().getSharedPreferences(StuckConstants.SHARED_PREFRENCE_USER, 0);
    android.content.SharedPreferences.Editor editor = pref.edit();
    editor.putString(StuckConstants.KEY_ENCODED_EMAIL, com.superpak.sammengistu.stuckapp.activities.StuckSignUpActivity.encodeEmail(email));
    editor.putString(StuckConstants.PROVIDER, provider);
    editor.apply();
}