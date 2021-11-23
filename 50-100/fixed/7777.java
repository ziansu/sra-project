@java.lang.Override
public java.util.Set<R> getAll() throws com.netflix.spinnaker.fiat.providers.ProviderException {
    try {
        return com.google.common.collect.ImmutableSet.copyOf(cache.get(com.netflix.spinnaker.fiat.providers.BaseProvider.CACHE_KEY, this::loadAll));
    } catch (java.util.concurrent.ExecutionException | com.google.common.util.concurrent.UncheckedExecutionException e) {
        throw new com.netflix.spinnaker.fiat.providers.ProviderException(this.getClass(), e.getCause());
    }
}