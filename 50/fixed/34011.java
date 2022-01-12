public int write(byte[] bytes, int len) {
    synchronized(this) {
        return sslWrite(bytes, len);
    }
}