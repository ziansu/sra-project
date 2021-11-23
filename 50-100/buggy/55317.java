public static int getPreferredIPPort(android.content.Context context) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String port = prefs.getString(context.getString(R.string.pref_client_ip_port_key), context.getString(R.string.pref_client_default_ip_port));
    return java.lang.Integer.valueOf(port);
}