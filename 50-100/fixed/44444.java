public short read16(short adr) {
    return ((short) (((mbc.read(adr)) & 255) | (((mbc.read(((short) (adr + 1)))) & 255) << 8)));
}