public static void c_MD5Update(java.security.MessageDigest md, long address, int len) {
    java.nio.ByteBuffer contents = eta.runtime.io.MemoryManager.getBoundedBuffer(address);
    contents.limit(((contents.position()) + len));
    md.update(contents);
}