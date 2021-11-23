private void serializeTlvs(final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.peer.up.Information tlvs, final io.netty.buffer.ByteBuf output) {
    if ((tlvs.getStringInformation()) != null) {
        for (final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.string.informations.StringInformation stringInfo : tlvs.getStringInformation()) {
            if ((stringInfo.getStringTlv()) != null) {
                serializeTlv(stringInfo.getStringTlv(), output);
            }
        }
    }
}