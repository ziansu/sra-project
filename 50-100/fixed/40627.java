public com.google.common.util.concurrent.ListenableFuture<org.opendaylight.controller.md.sal.dom.api.DOMRpcResult> discardChanges(final com.google.common.util.concurrent.FutureCallback<org.opendaylight.controller.md.sal.dom.api.DOMRpcResult> callback) {
    com.google.common.base.Preconditions.checkNotNull(callback);
    final com.google.common.util.concurrent.ListenableFuture<org.opendaylight.controller.md.sal.dom.api.DOMRpcResult> future = rpc.invokeRpc(org.opendaylight.controller.sal.connect.netconf.util.NetconfMessageTransformUtil.toPath(org.opendaylight.controller.sal.connect.netconf.util.NetconfMessageTransformUtil.NETCONF_DISCARD_CHANGES_QNAME), null);
    com.google.common.util.concurrent.Futures.addCallback(future, callback);
    return future;
}