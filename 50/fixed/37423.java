@java.lang.Override
public com.google.common.collect.ImmutableSet<com.github.rinde.rinsim.geom.Connection<E>> getConnections() {
    return com.google.common.collect.ImmutableSet.copyOf(data.values());
}