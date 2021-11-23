public boolean eof() {
    synchronized(lock) {
        return ((position) != null) && ((position.getBlockAddress()) >= (length));
    }
}