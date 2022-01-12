@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... strings) {
    java.lang.String mUsername = prefs.getString("username", "");
    if (mUsername != null) {
        android.content.SharedPreferences.Editor e = prefs.edit();
        e.putString("username", strings[0]);
        e.commit();
    }
    mUsername = prefs.getString("username", "");
    return mUsername;
}