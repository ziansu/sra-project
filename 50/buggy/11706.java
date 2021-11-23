public static java.lang.String getBaseUrl(android.content.Context activity) {
    boolean useHttps = android.preference.PreferenceManager.getDefaultSharedPreferences(activity).getBoolean(Constants.PREF_USE_HTTPS, false);
    if (useHttps)
        return (Constants.ROOT_HTTPS) + (Constants.ROOT_URL);
    else
        return (Constants.ROOT_HTTP) + (Constants.ROOT_URL);
    
}