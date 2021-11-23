private static cloud.ComputeServiceCache.CacheKey of(models.CloudCredential cloudCredential) {
    return new cloud.ComputeServiceCache.CacheKey(cloudCredential.getUser(), cloudCredential.getSecret(), cloudCredential.getCloud().api().getInternalProviderName(), cloudCredential.getCloud().getEndpoint().orElse(null));
}