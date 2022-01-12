public static void writeHandshake(java.io.OutputStream out, crypt.ssl.encoding.HandshakeMessage handshake) throws java.io.IOException {
    java.nio.ByteBuffer encodedHandshake = crypt.ssl.encoding.TlsEncoder.encodeHandshake(handshake);
    crypt.ssl.utils.IO.writeEnum(out, handshake.getContentType());
    crypt.ssl.utils.IO.writeInt24(out, encodedHandshake.remaining());
    crypt.ssl.utils.IO.writeBytes(out, encodedHandshake);
}