public void removeAll(final short p_nodeID) {
    de.hhu.bsinfo.dxnet.core.Request request;
    m_lock.writeLock().lock();
    for (int i = 0; i < (m_pendingRequests.length); i++) {
        request = m_pendingRequests[i];
        if ((request != null) && ((request.getDestination()) == p_nodeID)) {
            request.abort();
            m_pendingRequests[i] = null;
        }
    }
    m_lock.writeLock().unlock();
}