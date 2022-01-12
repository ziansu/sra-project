public void skip(long ns) throws java.io.IOException {
    synchronized(lock) {
        ensureOpen();
        next += ns;
        if (0 > (next))
            next = 0;
        
        if ((next) > (str.size()))
            next = str.size();
        
    }
}