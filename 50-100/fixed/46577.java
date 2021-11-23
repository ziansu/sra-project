public io.openio.sds.socket.SocketPool release(io.openio.sds.socket.PooledSocket sock) {
    leased.decrementAndGet();
    if ((sock.isInputShutdown()) || (!(q.offer(sock.lastUsage(java.lang.System.currentTimeMillis()))))) {
        sock.quietClose();
    }
    return this;
}