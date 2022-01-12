private void mergeDataWithinTransaction(final org.opendaylight.controller.md.sal.dom.api.DOMDataReadWriteTransaction writeTransaction, final org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType datastore, final org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier path, final org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode<?, ?> payload, final org.opendaylight.yangtools.yang.model.api.SchemaContext schemaContext) {
    org.opendaylight.netconf.sal.restconf.impl.BrokerFacade.LOG.trace("Merge {} within Restconf PATCH: {} with payload {}", datastore.name(), path, payload);
    org.opendaylight.restconf.restful.utils.TransactionUtil.ensureParentsByMerge(path, schemaContext, writeTransaction);
    if (payload instanceof org.opendaylight.yangtools.yang.data.api.schema.MapNode) {
        writeTransaction.merge(datastore, path, payload);
    }else {
        writeTransaction.put(datastore, path, payload);
    }
}