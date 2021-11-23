private boolean shouldRefresh(be.ugent.zeus.hydra.caching.CacheObject<?> object, long duration) {
    return (duration != (ALWAYS)) && ((((object == null) || (duration == (Cache.NEVER))) || (object.isExpired(org.threeten.bp.Duration.ofMillis(duration)))) || ((object.getVersion()) != (be.ugent.zeus.hydra.BuildConfig.VERSION_CODE)));
}