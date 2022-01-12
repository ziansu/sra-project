@java.lang.Override
public org.apache.ignite.IgniteFileSystem fileSystem(java.lang.String name) {
    if (name == null)
        throw new java.lang.IllegalArgumentException("IGFS name cannot be null");
    
    guard();
    try {
        checkClusterState();
        org.apache.ignite.IgniteFileSystem fs = ctx.igfs().igfs(name);
        if (fs == null)
            throw new java.lang.IllegalArgumentException(("IGFS is not configured: " + name));
        
        return fs;
    } finally {
        unguard();
    }
}