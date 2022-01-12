io.openio.sds.socket.PooledSocket markUnpooled() {
    this.pooled.set(false);
    return this;
}