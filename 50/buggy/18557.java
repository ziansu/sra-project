public void dispose() {
    if (disposed)
        return ;
    
    disposed = true;
    fadeListeners.clear();
    fadeListeners = null;
    timer.cancel();
    timer = null;
}