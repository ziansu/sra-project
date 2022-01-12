static boolean checkExpiration(android.content.Context context, java.io.File file) {
    long expiration = (java.lang.System.currentTimeMillis()) - (file.lastModified());
    return expiration < (com.bbtfr.merusuto.DataManager.EXPIRATION);
}