public java.lang.String getHeader() {
    final java.lang.String header;
    synchronized(buffer) {
        header = this.header;
    }
    return header.isEmpty() ? null : header;
}