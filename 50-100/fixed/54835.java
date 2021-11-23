private void log(java.lang.String s) {
    long startlogging = java.lang.System.currentTimeMillis();
    android.util.Log.d(org.epfl.locationprivacy.adaptiveprotection.AdaptiveProtection.LOGTAG, s);
    org.epfl.locationprivacy.util.Utils.appendLog(((org.epfl.locationprivacy.adaptiveprotection.AdaptiveProtection.LOGTAG) + ".txt"), s, context);
    totalLoggingTime += (java.lang.System.currentTimeMillis()) - startlogging;
}