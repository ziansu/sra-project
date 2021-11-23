public static int getDefaultLruCacheSize() {
    final int maxMemory = ((int) (java.lang.Runtime.getRuntime().maxMemory()));
    final int cacheSize = maxMemory / 8;
    return cacheSize;
}