@java.lang.Override
public com.github.rinde.rinsim.geom.Connection<E> getConnection(com.github.rinde.rinsim.geom.Point from, com.github.rinde.rinsim.geom.Point to) {
    com.google.common.base.Preconditions.checkArgument(hasConnection(from, to), "%s -> %s is not a connection", from, to);
    return data.get(from, to);
}