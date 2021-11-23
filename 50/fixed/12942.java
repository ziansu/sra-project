@java.lang.Override
public synchronized java.util.Set<java.lang.Integer> getGameObjectIds() {
    return java.util.Collections.unmodifiableSet(new java.util.HashSet<java.lang.Integer>(_objects.keySet()));
}