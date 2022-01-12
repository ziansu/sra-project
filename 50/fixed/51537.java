void disconnect() {
    this.connectedCnt.decrementAndGet();
}