@java.lang.Override
public final void run() {
    nodeExtension.onThreadStart(this);
    try {
        doRun();
    } catch (java.lang.InterruptedException e) {
        com.hazelcast.util.EmptyStatement.ignore(e);
    } catch (java.lang.Throwable t) {
        com.hazelcast.instance.OutOfMemoryErrorDispatcher.inspectOutputMemoryError(t);
        logger.severe(t);
    } finally {
        nodeExtension.onThreadStop(this);
    }
}