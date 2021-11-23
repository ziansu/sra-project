public io.openio.sds.socket.SocketPool release(io.openio.sds.socket.PooledSocket sock) {
    leased.decrementAndGet();
    if (sock.isInputShutdown()) {
        sock.quietClose();
    }else {
        q.offer(sock.lastUsage(java.lang.System.currentTimeMillis()));
    }
    return this;
}