@java.lang.Override
public <T extends org.gradle.caching.configuration.BuildCache> T remote(java.lang.Class<T> type, org.gradle.api.Action<? super T> configuration) {
    if ((remote) != null) {
        org.gradle.caching.configuration.internal.DefaultBuildCacheConfiguration.LOGGER.debug("Replacing remote build cache type {} with {}", remote.getClass().getCanonicalName(), type.getCanonicalName());
    }
    this.remote = createBuildCacheConfiguration(type);
    T configurationObject = org.gradle.internal.Cast.uncheckedCast(remote);
    configuration.execute(configurationObject);
    return configurationObject;
}