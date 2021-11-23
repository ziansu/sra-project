private void cleanUp(java.lang.ref.Reference<?> reference) throws jnr.ffi.util.ref.internal.Finalizer.ShutDown {
    java.lang.reflect.Method finalizeReferentMethod = getFinalizeReferentMethod();
    do {
        reference.clear();
        if (reference == (frqReference)) {
            throw new jnr.ffi.util.ref.internal.Finalizer.ShutDown();
        }
        try {
            finalizeReferentMethod.invoke(reference);
        } catch (java.lang.Throwable t) {
            jnr.ffi.util.ref.internal.Finalizer.logger.log(java.util.logging.Level.SEVERE, "Error cleaning up after reference.", t);
        }
    } while ((reference = queue.poll()) != null );
}