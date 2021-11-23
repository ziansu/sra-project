@java.lang.Override
public void run() {
    try {
        startServer();
    } catch (org.wso2.carbon.databridge.core.exception.DataBridgeException | org.wso2.carbon.databridge.core.exception.StreamDefinitionStoreException e) {
        e.printStackTrace();
    }
}