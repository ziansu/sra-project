private long ntohl(byte[] buf) {
    return (((((buf[0]) & 255) << 24) + (((buf[1]) & 255) << 16)) + (((buf[2]) & 255) << 8)) + ((buf[3]) & 255);
}