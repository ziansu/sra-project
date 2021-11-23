public boolean removeListener(org.promasi.network.tcp.ITcpClientListener listener) {
    boolean result = false;
    try {
        _lockObject.lock();
        if ((listener != null) && (_listeners.contains(listener))) {
            result = _listeners.remove(listener);
        }
    } finally {
        _lockObject.unlock();
    }
    return result;
}