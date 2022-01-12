@java.lang.Override
public com.neverwinterdp.registry.Transaction rdelete(java.lang.String path) throws com.neverwinterdp.registry.RegistryException {
    org.apache.zookeeper.common.PathUtils.validatePath(path);
    java.util.List<java.lang.String> tree = registry.findDencendantPaths(path);
    for (int i = (tree.size()) - 1; i >= 0; --i) {
        zkTransaction.delete(tree.get(i), (-1));
    }
    return this;
}