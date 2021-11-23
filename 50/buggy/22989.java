@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    android.util.Log.d(com.ashomok.imagetotext.sign_in.social_networks.silent_login.SilentSignInAsyncTask.TAG, "SilentSignInAsyncTask called");
    weakLoginManager.get().trySignInAutomatically();
    return null;
}