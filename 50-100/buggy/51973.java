public void reconnectSuccesful(java.lang.Long serverSessionID, org.mobicents.tools.smpp.multiplexer.MClientConnectionImpl connection) {
    mapReconnectionSchedule.get(serverSessionID).cancel(true);
    for (java.lang.Long key : customers.keySet())
        customers.get(key).reconnectState(false);
    
    connectionsToServers.put(serverSessionID, connection);
}