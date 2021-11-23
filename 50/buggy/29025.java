private com.sun.enterprise.resource.ResourceHandle getNewResource(com.sun.enterprise.resource.allocator.ResourceAllocator alloc) throws com.sun.appserv.connectors.internal.api.PoolingException {
    ds.addResource(alloc, 1);
    return ds.getResource();
}