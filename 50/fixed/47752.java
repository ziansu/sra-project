protected static java.lang.String getDeviceID(android.content.Context context) {
    java.lang.String uuid = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    return uuid;
}