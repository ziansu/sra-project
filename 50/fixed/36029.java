public int read(byte[] bytes) {
    synchronized(this) {
        return sslRead(bytes);
    }
}