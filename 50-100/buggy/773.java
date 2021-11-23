private java.lang.String getSharedPreferenceUid() {
    java.lang.String uid = "";
    if (mSharedPreferences.contains(getResources().getString(R.string.application_uid_key))) {
        uid = mSharedPreferences.getString(getResources().getString(R.string.application_uid_key), getResources().getString(R.string.default_application_uid_value));
    }else {
        setSharedPreferenceUid(getResources().getString(R.string.default_application_uid_value));
    }
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, ("getSharedPreferenceUid: " + uid));
    return uid;
}