public int getConnectionCount() {
    if (isCentral()) {
        return (m_peripheralDevices) == null ? 0 : m_peripheralDevices.size();
    }else {
        return (m_centralDevice) == null ? 0 : 1;
    }
}