@java.lang.Override
public java.lang.Boolean block() throws java.lang.InterruptedException {
    return finished.await(timeout, java.util.concurrent.TimeUnit.SECONDS);
}