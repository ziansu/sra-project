public static int getVersionCode() {
    if (com.couchbase.lite.support.Version.VERSION_CODE.contains("VERSION_CODE")) {
        return 0;
    }
    if (((com.couchbase.lite.support.Version.VERSION_CODE) == null) || (com.couchbase.lite.support.Version.VERSION_CODE.isEmpty())) {
        return 0;
    }
    try {
        java.lang.Integer.parseInt(com.couchbase.lite.support.Version.VERSION_CODE);
    } catch (java.lang.NumberFormatException e) {
        com.couchbase.lite.util.Log.w(Log.TAG, "Cannot parse version code: %s", com.couchbase.lite.support.Version.VERSION_CODE);
        return 0;
    }
    return -1;
}