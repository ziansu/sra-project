private void createPipeline(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node node) {
    java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table> tableList = getTableList(node);
    for (org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table table : tableList) {
        java.util.List<java.lang.Short> nextIds = getNextTablesMiss(node.getId(), table.getId());
        if (nextIds.isEmpty())
            break;
        
        java.lang.Short nextId = java.util.Collections.min(nextIds);
        java.lang.Short currentId = table.getId();
        addFlowGoto(node, currentId, nextId);
    }
}