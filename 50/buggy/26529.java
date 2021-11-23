@java.lang.Override
public V get(long l, @javax.annotation.Nonnull
java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    if ((except) != null) {
        throw new java.util.concurrent.ExecutionException(except.getMessage(), except);
    }
    return result;
}