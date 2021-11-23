@java.lang.Override
public void operationComplete(final io.netty.util.concurrent.Future<java.lang.Object> future) throws java.lang.Exception {
    try {
        future.get();
        success();
    } catch (final java.lang.InterruptedException ie) {
        fail(ie);
    } catch (final java.util.concurrent.ExecutionException ee) {
        fail(ee.getCause());
    }
}