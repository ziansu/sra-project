@java.lang.Override
public void close() throws java.io.IOException {
    if (!(pooled)) {
        pool.release(this);
        pooled = true;
    }
}