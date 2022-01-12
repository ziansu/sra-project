@java.lang.Override
public boolean offer(int[] ordinals, @javax.annotation.Nonnull
java.lang.Object item) {
    if (wrappedOutbox.offer(ordinals, item)) {
        log(item);
        return true;
    }
    return false;
}