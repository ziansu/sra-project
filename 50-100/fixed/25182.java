@java.lang.Override
public void start() {
    if (!(future.closed())) {
        io.crate.jobs.ExecutionSubContextBase.LOGGER.trace("starting {}: {}", this, id);
        try {
            innerStart();
        } catch (java.lang.Throwable t) {
            close(t);
        }
    }
}