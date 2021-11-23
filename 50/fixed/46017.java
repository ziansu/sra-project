public void removeTribe(java.util.UUID uuid) {
    com.google.common.base.Preconditions.checkNotNull(uuid);
    tribeMap.remove(uuid);
}