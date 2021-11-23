public boolean eof() {
    synchronized(lock) {
        return ((position) != null) && (((position.getBlockAddress()) < 0) || ((position.getBlockAddress()) >= (length)));
    }
}