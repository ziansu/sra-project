public static boolean matchIgfsCacheName(@org.jetbrains.annotations.Nullable
java.lang.String cacheName) {
    return (cacheName != null) && (cacheName.startsWith(org.apache.ignite.internal.processors.igfs.IgfsUtils.IGFS_CACHE_PREFIX));
}