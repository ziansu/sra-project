@java.lang.Override
public void connect(com.hypersocket.client.rmi.Connection c) throws java.rmi.RemoteException {
    checkValidConnect(c);
    if (com.hypersocket.client.service.ClientServiceImpl.log.isInfoEnabled()) {
        com.hypersocket.client.service.ClientServiceImpl.log.info(((("Scheduling connect for connection id " + (c.getId())) + "/") + (c.getHostname())));
    }
    com.hypersocket.client.service.ConnectionJob task = createJob(c);
    connectingClients.put(c, task);
    timer.schedule(task, 500);
}