void removeRoutes(final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.multiprotocol.rev130919.update.path.attributes.MpUnreachNlri nlri) {
    final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.rib.rev130925.rib.TablesKey key = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.rib.rev130925.rib.TablesKey(nlri.getAfi(), nlri.getSafi());
    final org.opendaylight.protocol.bgp.rib.impl.TableContext ctx = tables.get(key);
    if (ctx == null) {
        org.opendaylight.protocol.bgp.rib.impl.AdjRibInWriter.LOG.debug("No table for {}, not accepting NLRI {}", key, nlri);
        return ;
    }
    final org.opendaylight.controller.md.sal.dom.api.DOMDataWriteTransaction tx = chain.newWriteOnlyTransaction();
    ctx.removeRoutes(null, tx, nlri);
    tx.submit();
}