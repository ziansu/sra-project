public void rewind(long ns) throws java.io.IOException {
    synchronized(lock) {
        ensureOpen();
        if ((next) >= (str.size()))
            return ;
        
        next -= ns;
        if (0 > (next))
            next = 0;
        
        if ((next) > (str.size()))
            next = str.size();
        
    }
}