@java.lang.Override
public io.vertx.java.spi.cluster.impl.jgroups.domain.ImmutableChoosableSet<T> remove(T value) {
    checkSanity(value);
    if (value.equals(this.value)) {
        return next;
    }
    return next.remove(value).add(value);
}