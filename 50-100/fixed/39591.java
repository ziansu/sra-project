public static org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ovsdb.rev150105.ovsdb.node.attributes.ConnectionInfo getConnectionInfo(org.opendaylight.controller.md.sal.binding.api.DataBroker dataBroker, org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId ovsdbNodeId) {
    final org.opendaylight.yangtools.yang.binding.InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node> nodeIid = org.opendaylight.unimgr.impl.UnimgrMapper.getOvsdbNodeIid(ovsdbNodeId);
    final com.google.common.base.Optional<org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node> node = org.opendaylight.unimgr.utils.MdsalUtils.readNode(dataBroker, LogicalDatastoreType.OPERATIONAL, nodeIid);
    if (node.isPresent()) {
        final org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node ovsdbNode = node.get();
        final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ovsdb.rev150105.OvsdbNodeAugmentation ovsdbNodeAugmentation = ovsdbNode.getAugmentation(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ovsdb.rev150105.OvsdbNodeAugmentation.class);
        return ovsdbNodeAugmentation.getConnectionInfo();
    }else {
        return null;
    }
}