private java.lang.reflect.Method getFinalizeReferentMethod() throws jnr.ffi.util.ref.internal.Finalizer.ShutDown {
    java.lang.Class<?> finalizableReferenceClass = finalizableReferenceClassReference.get();
    if (finalizableReferenceClass == null) {
        throw new jnr.ffi.util.ref.internal.Finalizer.ShutDown();
    }
    try {
        return finalizableReferenceClass.getMethod("finalizeReferent");
    } catch (java.lang.NoSuchMethodException e) {
        throw new java.lang.AssertionError(e);
    }
}