@java.lang.Override
public void operationComplete(final io.netty.util.concurrent.Future<java.lang.Object> future) throws java.lang.Exception {
    com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("FutureListener");
    try {
        future.get();
        com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("FutureListener success");
        success();
    } catch (final java.lang.InterruptedException ie) {
        com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("FutureListener fail", ie);
        fail(ie);
    } catch (final java.util.concurrent.ExecutionException ee) {
        com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("FutureListener fail", ee);
        fail(ee.getCause());
    }
}