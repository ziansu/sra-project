@java.lang.Override
public java.lang.Boolean block() throws java.lang.InterruptedException {
    finished.await(timeout, java.util.concurrent.TimeUnit.SECONDS);
    return SUCCESS;
}