public boolean userLogin(int id, java.lang.String email) {
    this.id = id;
    android.content.SharedPreferences sharedPreferences = com.example.grazyna.riffking.SharedPrefManager.mCtx.getSharedPreferences(com.example.grazyna.riffking.SharedPrefManager.SHARED_PREF_NAME, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putInt(com.example.grazyna.riffking.SharedPrefManager.KEY_USER_ID, id);
    editor.putString(com.example.grazyna.riffking.SharedPrefManager.KEY_USER_EMAIL, email);
    editor.apply();
    return true;
}