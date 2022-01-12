private void initConfigFlows() {
    final com.google.common.base.Optional<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table> table = readLatestConfiguration(tableRef);
    java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.Flow> localList = null;
    if (table.isPresent()) {
        localList = table.get().getFlow();
    }
    if (localList == null) {
        configFlows = java.util.Collections.emptyList();
    }else {
        configFlows = new java.util.LinkedList(localList);
    }
}