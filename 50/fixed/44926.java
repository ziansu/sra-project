protected void finalize() throws java.lang.Throwable {
    try {
        com.microsoft.z3.Native.delConstructor(getContext().nCtx(), getNativeObject());
    } catch (java.lang.Throwable t) {
        throw t;
    } finally {
        super.finalize();
    }
}