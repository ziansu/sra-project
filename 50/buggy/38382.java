private io.openio.sds.socket.PooledSocket tryCreate() {
    if (canCreate())
        return create();
    
    return null;
}