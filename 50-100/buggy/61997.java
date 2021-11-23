private static cloud.ComputeServiceCache.CacheKey of(models.CloudCredential cloudCredential) {
    return new cloud.ComputeServiceCache.CacheKey(cloudCredential.getUser(), cloudCredential.getSecret(), cloudCredential.getCloud().getEndpoint().orElse(null), cloudCredential.getCloud().api().getInternalProviderName());
}