@java.lang.Override
public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> create(java.lang.Throwable t) throws java.lang.Exception {
    com.google.common.base.Throwables.propagateIfInstanceOf(t, com.datastax.driver.core.ClusterNameMismatchException.class);
    com.google.common.base.Throwables.propagateIfInstanceOf(t, com.datastax.driver.core.UnsupportedProtocolVersionException.class);
    com.google.common.base.Throwables.propagateIfInstanceOf(t, com.datastax.driver.core.SetKeyspaceException.class);
    com.google.common.base.Throwables.propagateIfInstanceOf(t, java.lang.Error.class);
    return com.datastax.driver.core.utils.MoreFutures.VOID_SUCCESS;
}