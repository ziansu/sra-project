long crc32(long address, long offset, long len) {
    java.util.zip.CRC32 crc = new java.util.zip.CRC32();
    for (; (len--) > 0; offset++)
        crc.update(org.caffinitas.ohc.linked.Uns.getByte(address, offset));
    
    long h = crc.getValue();
    h |= h << 32;
    return h;
}