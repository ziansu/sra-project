public synchronized byte[] getPkg() {
    if (!(rpool.isEmpty())) {
        return ((byte[]) (rpool.removeFirst()));
    }
    return null;
}