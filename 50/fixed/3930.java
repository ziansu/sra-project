@java.lang.Override
public void close() throws java.io.IOException {
    if (!(pooled.get())) {
        pool.release(this);
        pooled.set(true);
    }
}