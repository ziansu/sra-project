public static java.lang.String read(java.nio.ByteBuffer buf) throws net.ae97.pokebot.extensions.mcping.protocol.datatypes.DataTypeException {
    final int length = net.ae97.pokebot.extensions.mcping.protocol.datatypes.VarInt.read(buf);
    if (length < 0) {
        throw new net.ae97.pokebot.extensions.mcping.protocol.datatypes.DataTypeException("negative length prefix");
    }
    final byte[] stringBuf = new byte[length];
    buf.put(stringBuf);
    try {
        return new java.lang.String(stringBuf, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        throw new java.lang.RuntimeException(e);
    }
}