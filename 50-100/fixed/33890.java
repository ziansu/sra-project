public boolean checkoutDupCacheSize(final int windowSize, final int idCacheSize) {
    final int msgNumInFlight = windowSize / (org.hornetq.core.server.cluster.impl.ClusterConnectionImpl.DEFAULT_JMS_MESSAGE_SIZE);
    if (msgNumInFlight == 0) {
        return true;
    }
    boolean sizeGood = false;
    if (idCacheSize >= msgNumInFlight) {
        int r = idCacheSize / msgNumInFlight;
        if ((r >= (org.hornetq.core.server.cluster.impl.ClusterConnectionImpl.RANGE_SIZE_MIN)) && (r <= (org.hornetq.core.server.cluster.impl.ClusterConnectionImpl.RANGE_SZIE_MAX))) {
            sizeGood = true;
        }
    }
    return sizeGood;
}