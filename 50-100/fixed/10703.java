public boolean allClientsAhead(java.lang.Long workQueueHeadTime) {
    synchronized(lock) {
        for (net.grigoriadi.sc.domain.Client client : registeredClients) {
            java.lang.Long time = lastItemTimesByClient.get(client.getClientId());
            if ((time == null) || (workQueueHeadTime >= time)) {
                return false;
            }
        }
    }
    return true;
}