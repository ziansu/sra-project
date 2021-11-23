@java.lang.Override
public void prepareMarshal(org.apache.ignite.internal.processors.cache.GridCacheSharedContext ctx) throws org.apache.ignite.IgniteCheckedException {
    super.prepareMarshal(ctx);
    org.apache.ignite.internal.processors.cache.GridCacheContext cctx = ctx.cacheContext(cacheId);
    prepareMarshalCacheObjects(failedKeys, cctx);
    prepareMarshalCacheObjects(nearEvicted, cctx);
    if ((errBytes) == null)
        errBytes = ctx.marshaller().marshal(err);
    
}