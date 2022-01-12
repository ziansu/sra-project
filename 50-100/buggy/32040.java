public java.util.List<java.lang.String> findDencendantPaths(java.lang.String path) throws com.neverwinterdp.registry.RegistryException {
    checkConnected();
    try {
        org.apache.zookeeper.common.PathUtils.validatePath(path);
        return org.apache.zookeeper.ZKUtil.listSubTreeBFS(zkClient, realPath(path));
    } catch (java.lang.InterruptedException | org.apache.zookeeper.KeeperException e) {
        throw new com.neverwinterdp.registry.RegistryException(com.neverwinterdp.registry.ErrorCode.Unknown, e);
    }
}