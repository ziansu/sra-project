public void startServer() throws org.wso2.carbon.databridge.core.exception.DataBridgeException, org.wso2.carbon.databridge.core.exception.StreamDefinitionStoreException {
    msgCount.set(0);
    start(listeningPort);
}