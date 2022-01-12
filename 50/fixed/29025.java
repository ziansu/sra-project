private com.sun.enterprise.resource.ResourceHandle getNewResource(com.sun.enterprise.resource.allocator.ResourceAllocator alloc) throws com.sun.appserv.connectors.internal.api.PoolingException {
    addResource(alloc);
    return ds.getResource();
}