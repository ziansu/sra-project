public java.lang.String getToken() {
    return mSharedPreferences.getString(eu.marcocattaneo.androidinstagramconnector.connection.InstagramSession.PREF_SHARED_TOKEN, null);
}