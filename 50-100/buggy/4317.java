private void updateCounter(java.lang.String k, long curr) {
    final long prev = getAndSetPrevious(k, curr);
    final com.netflix.spectator.api.Id id = nameFunction.apply(k);
    if (id != null) {
        spectatorRegistry.counter(id).increment((prev - curr));
    }
}