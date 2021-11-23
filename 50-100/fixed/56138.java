private byte[] getBytesFromPrefs(java.lang.String service, java.lang.String prefix) {
    java.lang.String value = prefs.getString((service + prefix), null);
    if (value != null) {
        return android.util.Base64.decode(value, Base64.DEFAULT);
    }
    return null;
}