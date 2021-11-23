@java.lang.Override
public java.lang.String read(java.nio.ByteBuffer binary) throws java.io.IOException, java.lang.ClassNotFoundException {
    byte[] bytes = new byte[binary.remaining()];
    binary.get(bytes);
    binary.flip();
    return new java.lang.String(bytes, org.ehcache.jsr107.StringSerializer.CHARSET);
}