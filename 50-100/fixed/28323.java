public boolean addListener(org.promasi.network.tcp.ITcpClientListener listener) {
    boolean result = false;
    try {
        _lockObject.lock();
        if ((listener != null) && (!(_listeners.contains(listener)))) {
            result = _listeners.add(listener);
        }
    } finally {
        _lockObject.unlock();
    }
    return result;
}