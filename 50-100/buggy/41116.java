void cleanTables(final java.util.Collection<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.rib.rev130925.rib.TablesKey> tableTypes) {
    final org.opendaylight.controller.md.sal.dom.api.DOMDataWriteTransaction tx = chain.newWriteOnlyTransaction();
    for (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.rib.rev130925.rib.TablesKey k : tableTypes) {
        org.opendaylight.protocol.bgp.rib.impl.AdjRibInWriter.LOG.debug("Clearing table {}", k);
        tables.get(k).clearTable(tx);
    }
    tx.submit();
}