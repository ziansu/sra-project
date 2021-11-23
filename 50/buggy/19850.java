static boolean checkExpiration(android.content.Context context, java.lang.String key) {
    long expiration = (java.lang.System.currentTimeMillis()) - (com.bbtfr.merusuto.DataManager.getLocalFile(key).lastModified());
    return expiration < (com.bbtfr.merusuto.DataManager.EXPIRATION);
}