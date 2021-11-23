@java.lang.Override
public void serializeTlvs(final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.pcep.ietf.stateful.rev131222.lsp.object.lsp.Tlvs tlvs, final io.netty.buffer.ByteBuf body) {
    super.serializeTlvs(tlvs, body);
    serializeAugmentation(tlvs.getAugmentation(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.pcep.sync.optimizations.rev150714.Tlvs1.class), body);
}