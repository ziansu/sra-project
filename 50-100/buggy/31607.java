public static org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix prefixForBytes(final byte[] bytes, final int length) {
    com.google.common.base.Preconditions.checkArgument((length <= ((bytes.length) * (java.lang.Byte.SIZE))));
    final byte[] tmp = java.util.Arrays.copyOfRange(bytes, 0, org.opendaylight.protocol.util.Ipv4Util.IP4_LENGTH);
    return IetfInetUtil.INSTANCE.ipv4PrefixFor(tmp, length);
}