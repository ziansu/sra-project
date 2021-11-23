private void onPeerDown(final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.PeerDownNotification peerDown) {
    final org.opendaylight.controller.md.sal.dom.api.DOMDataWriteTransaction wTx = this.domTxChain.newWriteOnlyTransaction();
    wTx.delete(LogicalDatastoreType.OPERATIONAL, this.peerYangIId);
    wTx.submit();
    close();
}