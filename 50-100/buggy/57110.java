public it.grid.storm.namespace.StoRI resolveStoRIbyAbsolutePath(java.lang.String absolutePath) throws it.grid.storm.namespace.NamespaceException {
    it.grid.storm.namespace.VirtualFSInterface vfs = resolveVFSbyAbsolutePath(absolutePath);
    log.debug("VFS retrivied is {}", vfs.getAliasName());
    log.debug("VFS instance is {}", vfs.hashCode());
    java.lang.String relativePath = it.grid.storm.namespace.naming.NamespaceUtil.extractRelativePath(vfs.getRootPath(), absolutePath);
    it.grid.storm.namespace.StoRI stori = vfs.createFile(relativePath);
    return stori;
}