void markTablesUptodate(final java.util.Collection<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.rib.rev130925.rib.TablesKey> tableTypes) {
    final org.opendaylight.controller.md.sal.dom.api.DOMDataWriteTransaction tx = chain.newWriteOnlyTransaction();
    for (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.rib.rev130925.rib.TablesKey k : tableTypes) {
        final org.opendaylight.protocol.bgp.rib.impl.TableContext ctx = tables.get(k);
        tx.merge(LogicalDatastoreType.OPERATIONAL, ctx.getTableId().node(Attributes.QNAME).node(org.opendaylight.protocol.bgp.rib.impl.AdjRibInWriter.ATTRIBUTES_UPTODATE_TRUE.getNodeType()), org.opendaylight.protocol.bgp.rib.impl.AdjRibInWriter.ATTRIBUTES_UPTODATE_TRUE);
    }
    tx.submit();
}