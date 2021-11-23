@java.lang.Override
public boolean offer(int ordinal, @javax.annotation.Nonnull
java.lang.Object item) {
    if (wrappedOutbox.offer(ordinal, item)) {
        log(item);
        return true;
    }
    return false;
}