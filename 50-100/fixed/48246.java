@java.lang.Override
public void prepare() {
    if (!(future.closed())) {
        io.crate.jobs.ExecutionSubContextBase.LOGGER.trace("preparing {}: {}", this, id);
        try {
            innerPrepare();
        } catch (java.lang.Throwable t) {
            close(t);
        }
    }
}