public void removeTribe(java.util.UUID uuid) {
    com.google.common.base.Preconditions.checkNotNull(uuid);
    com.google.common.base.Preconditions.checkState(tribeMap.containsKey(uuid));
    tribeMap.remove(uuid);
}