public boolean addListener(org.promasi.network.tcp.ITcpClientListener listener) {
    boolean result = false;
    if (listener != null) {
        try {
            _lockObject.lock();
            if (_listeners.contains(listener)) {
                return false;
            }else {
                result = _listeners.add(listener);
            }
        } finally {
            _lockObject.unlock();
        }
    }
    return result;
}