int doRead() throws java.io.IOException {
    synchronized(current) {
        if ((current) == null) {
            current = nextLine();
        }
        int read = current.read();
        if (read == (-1)) {
            current = nextLine();
            read = current.read();
        }
        return read;
    }
}