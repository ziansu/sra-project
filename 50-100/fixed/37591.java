public com.vmware.xenon.common.http.netty.NettyChannelContext getFirstValidHttp2Context(java.lang.String host, int port) {
    if (!(this.isHttp2Only)) {
        throw new java.lang.IllegalStateException("Internal error: can't get HTTP/2 information about HTTP/1 context");
    }
    java.lang.String key = com.vmware.xenon.common.http.netty.NettyChannelPool.toConnectionKey(host, port);
    com.vmware.xenon.common.http.netty.NettyChannelPool.NettyChannelGroup group = getChannelGroup(key);
    com.vmware.xenon.common.http.netty.NettyChannelContext context = selectHttp2Context(group, host, port, key);
    return context;
}