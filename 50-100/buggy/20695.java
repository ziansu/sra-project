private static void upgradeCacheDatabase() {
    int oldVersion = android.webkit.WebViewDatabase.mCacheDatabase.getVersion();
    if (oldVersion != 0) {
        android.util.Log.i(android.webkit.WebViewDatabase.LOGTAG, (((("Upgrading cache database from version " + oldVersion) + " to ") + (android.webkit.WebViewDatabase.DATABASE_VERSION)) + ", which will destroy all old data"));
    }
    android.webkit.WebViewDatabase.mCacheDatabase.execSQL("DROP TABLE IF EXISTS cache");
    android.webkit.WebViewDatabase.mCacheDatabase.setVersion(android.webkit.WebViewDatabase.CACHE_DATABASE_VERSION);
}