private void startAuthActivity(agency.tango.skald.core.errors.AuthError authError) {
    if (authError.hasResolution()) {
        android.content.Intent intent = authError.getResolution();
        startActivityForResult(intent, com.spotify.sdk.android.authentication.LoginActivity.REQUEST_CODE);
    }
}