@java.lang.Override
public io.vertx.java.spi.cluster.impl.jgroups.domain.ImmutableChoosableSet<T> remove(T value) {
    checkSanity(value);
    if (this.value.equals(value)) {
        return next;
    }else {
        this.next = next.remove(value);
        return this;
    }
}