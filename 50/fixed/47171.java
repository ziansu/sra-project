private static synchronized okhttp3.Cache getCache(android.content.Context application) {
    if ((org.gem.indo.dooit.api.managers.DooitManager.cache) == null) {
        org.gem.indo.dooit.api.managers.DooitManager.cache = new okhttp3.Cache(application.getCacheDir(), ((10 * 1024) * 1024));
    }
    return org.gem.indo.dooit.api.managers.DooitManager.cache;
}