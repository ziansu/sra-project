@java.lang.Override
public void flush() {
    notifyFlush();
    try {
        pool.getSymbols().flush();
    } catch (final org.exist.EXistException e) {
        org.exist.storage.LOG.error(e);
    }
    indexController.flush();
    nodesCount = 0;
}