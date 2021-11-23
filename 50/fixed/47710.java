@java.lang.Override
public void close() {
    org.jw.basex.async.XqPromise.pool.shutdown();
}