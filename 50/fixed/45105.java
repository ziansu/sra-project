private synchronized int nextServerSlot() {
    if ((serverCache.size()) == 0) {
        return -1;
    }
    return (++(serverIdx)) % (serverCache.size());
}