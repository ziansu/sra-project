private boolean cleanUp(java.lang.ref.Reference<?> reference) {
    java.lang.reflect.Method finalizeReferentMethod = getFinalizeReferentMethod();
    if (finalizeReferentMethod == null) {
        return false;
    }
    do {
        reference.clear();
        if (reference == (frqReference)) {
            return false;
        }
        try {
            finalizeReferentMethod.invoke(reference);
        } catch (java.lang.Throwable t) {
            jnr.ffi.util.ref.internal.Finalizer.logger.log(java.util.logging.Level.SEVERE, "Error cleaning up after reference.", t);
        }
    } while ((reference = queue.poll()) != null );
    return true;
}