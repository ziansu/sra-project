@java.lang.Override
public boolean offer(int[] ordinals, @javax.annotation.Nonnull
java.lang.Object item) {
    return (wrappedOutbox.offer(ordinals, item)) && (log(item));
}