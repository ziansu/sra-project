private boolean updateCompressionState(final org.opendaylight.yangtools.yang.binding.InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNode> flowcapableNodePath, final org.opendaylight.openflowplugin.applications.frsync.util.SyncupEntry syncupEntry) {
    final org.opendaylight.openflowplugin.applications.frsync.util.SyncupEntry previousEntry = compressionQueue.get(flowcapableNodePath);
    if ((previousEntry != null) && (syncupEntry.isOptimizedConfigDelta())) {
        updateOptimizedConfigDelta(flowcapableNodePath, syncupEntry, previousEntry);
    }else {
        compressionQueue.put(flowcapableNodePath, syncupEntry);
    }
    return previousEntry == null;
}