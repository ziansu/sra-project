@java.lang.Override
public boolean resume(java.lang.Object entity) {
    synchronized(responseLock) {
        if (done) {
            return false;
        }
        if (cancelled) {
            return false;
        }
        org.vsg.cusp.engine.rapidoid.spi.AsyncContext asyncContext = getAsyncContext();
        try {
            return internalResume(entity);
        } finally {
            done = true;
            asyncContext.complete();
        }
    }
}