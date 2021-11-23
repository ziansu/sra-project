public static boolean matchIgfsCacheName(@org.jetbrains.annotations.Nullable
java.lang.String cacheName) {
    return ((cacheName != null) && (cacheName.startsWith(org.apache.ignite.internal.processors.igfs.IgfsUtils.IGFS_CACHE_PREFIX))) && ((cacheName.endsWith(org.apache.ignite.internal.processors.igfs.IgfsUtils.DATA_CACHE_SUFFIX)) || (cacheName.endsWith(org.apache.ignite.internal.processors.igfs.IgfsUtils.META_CACHE_SUFFIX)));
}