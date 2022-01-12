@java.lang.Override
public void stop() throws i5.las2peer.api.ConnectorException {
    i5.las2peer.webConnector.serviceManagement.ServiceRepositoryManager.stop();
    if ((https) != null) {
        https.stop(0);
    }else
        if ((http) != null) {
            http.stop(0);
        }
    
    logMessage("Web-Connector has been stopped");
    this.myNode = null;
}