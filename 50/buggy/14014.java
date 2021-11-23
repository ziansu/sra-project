@java.lang.Override
public void run() {
    try {
        startServer();
    } catch (org.wso2.carbon.databridge.core.exception.DataBridgeException e) {
        e.printStackTrace();
    } catch (org.wso2.carbon.databridge.core.exception.StreamDefinitionStoreException e) {
        e.printStackTrace();
    }
}