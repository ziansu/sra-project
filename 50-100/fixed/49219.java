@java.lang.Override
public void connect(org.wso2.extension.siddhi.io.http.source.ConnectionCallback connectionCallback) throws org.wso2.siddhi.core.exception.ConnectionUnavailableException {
    this.httpConnectorRegistry.registerServerConnector(this.listenerUrl, this.sourceId, this.listenerConfig);
    this.httpConnectorRegistry.registerSourceListener(sourceEventListener, this.listenerUrl, java.lang.Integer.parseInt(workerThread), isAuth, requestedTransportPropertyNames);
}