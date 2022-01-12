@java.lang.Override
public boolean setTableId(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId nodeId, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.FlowBuilder flowBuilder) {
    java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table> tableList = getTableList(nodeId);
    for (org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table table : tableList) {
        java.util.List<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties> tableFeaturePropertiesList = getTableFeatureProperties(nodeId, table.getId());
        if (isFlowSupported(tableFeaturePropertiesList, flowBuilder)) {
            flowBuilder.setTableId(table.getId());
            return true;
        }
    }
    return false;
}