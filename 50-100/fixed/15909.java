@java.lang.Override
public com.google.common.util.concurrent.ListenableFuture<org.dykman.jtl.core.JSON> call(final org.dykman.jtl.core.engine.future.AsyncExecutionContext<org.dykman.jtl.core.JSON> context, final com.google.common.util.concurrent.ListenableFuture<org.dykman.jtl.core.JSON> t) {
    try {
        if (t == null)
            return com.google.common.util.concurrent.Futures.immediateFuture(builder.value());
        
        java.lang.System.err.println(("variable: " + name));
        return context.lookup(name, t);
    } catch (java.lang.Exception e) {
        return com.google.common.util.concurrent.Futures.immediateFailedCheckedFuture(new org.dykman.jtl.core.engine.ExecutionException(e));
    }
}