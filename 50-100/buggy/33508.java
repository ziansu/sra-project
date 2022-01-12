public boolean removeListener(org.promasi.network.tcp.ITcpClientListener listener) throws org.promasi.utilities.exceptions.NullArgumentException {
    if (listener == null) {
        throw new org.promasi.utilities.exceptions.NullArgumentException("Wrong argument listener==null");
    }
    try {
        _lockObject.lock();
        if (_listeners.contains(listener)) {
            _listeners.remove(listener);
            return true;
        }
    } finally {
        _lockObject.unlock();
    }
    return false;
}