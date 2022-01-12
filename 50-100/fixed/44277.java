private void saveckSession(java.lang.String ckSession) {
    this.ckSession = ckSession;
    android.content.SharedPreferences sharedPreferences = getContext().getSharedPreferences(DroidNubeKitConstants.CLOUDKIT_SHARED_PREFERENCES, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(DroidNubeKitConstants.CLOUDKIT_SESSION_KEY, ckSession);
    editor.commit();
    checkSessionAlive();
}