@java.lang.Override
public java.util.List<java.lang.String> getTables(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node node, java.lang.String databaseName) {
    java.util.concurrent.ConcurrentMap<java.lang.String, java.util.concurrent.ConcurrentMap<java.lang.String, org.opendaylight.ovsdb.lib.notation.Row>> cache = ovsdbInventoryService.getCache(node, databaseName);
    if (cache == null) {
        return null;
    }else {
        return new java.util.ArrayList<java.lang.String>(cache.keySet());
    }
}