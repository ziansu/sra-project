private static io.hops.transaction.EntityManager.Context context() {
    io.hops.transaction.EntityManager.Context ctx = io.hops.transaction.EntityManager.context.get();
    if (ctx == null) {
        throw new java.lang.RuntimeException("context was not initialized");
    }
    return ctx;
}