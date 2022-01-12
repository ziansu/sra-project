public synchronized void setMinPool(int minPool) {
    this.minPool = minPool;
    if ((pool) != null)
        pool.setParameters(this.minPool, pool.getMaxPool(), pool.getMaxSize(), pool.getIdleTimeout());
    
}