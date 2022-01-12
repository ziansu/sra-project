private void checkForSession() {
    android.content.SharedPreferences sharedPreferences = getContext().getSharedPreferences(DroidNubeKitConstants.CLOUDKIT_SHARED_PREFERENCES, Context.MODE_PRIVATE);
    java.lang.String ckSession = sharedPreferences.getString(DroidNubeKitConstants.CLOUDKIT_SESSION_KEY, "");
    if ((ckSession != null) && ((ckSession.length()) > 0)) {
        net.moddity.droidnubekit.DroidNubeKit.getInstance().ckSession = ckSession;
        checkSessionAlive();
    }
}