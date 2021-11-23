private final boolean is7BitClean(org.forgerock.opendj.ldap.ByteSequence value) {
    for (int i = 0; i < (value.length()); i++) {
        byte b = value.byteAt(i);
        if ((b & (org.opends.server.plugins.SevenBitCleanPlugin.MASK)) != b) {
            return false;
        }
    }
    return true;
}