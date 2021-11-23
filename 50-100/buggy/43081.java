@com.google.common.annotations.VisibleForTesting
org.gradle.caching.internal.RoleAwareBuildCacheService createDecoratedBuildCacheService(java.lang.String role, org.gradle.caching.configuration.BuildCache buildCache) {
    org.gradle.caching.internal.RoleAwareBuildCacheService buildCacheService = new org.gradle.caching.internal.BuildCacheServiceProvider.BuildCacheServiceWithRole(role, createRawBuildCacheService(buildCache));
    org.gradle.caching.internal.BuildCacheServiceProvider.LOGGER.warn("Using {} as {} build cache, push is {}.", buildCacheService.getDescription(), role, (buildCache.isPush() ? "enabled" : "disabled"));
    buildCacheService = new org.gradle.caching.internal.BuildOperationFiringBuildCacheServiceDecorator(buildOperationExecutor, buildCacheService);
    buildCacheService = new org.gradle.caching.internal.LoggingBuildCacheServiceDecorator(buildCacheService);
    buildCacheService = new org.gradle.caching.internal.ShortCircuitingErrorHandlerBuildCacheServiceDecorator(org.gradle.caching.internal.BuildCacheServiceProvider.MAX_ERROR_COUNT_FOR_BUILD_CACHE, buildCacheService);
    return buildCacheService;
}