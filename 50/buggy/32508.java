@java.lang.Override
public boolean receive(org.wso2.carbon.messaging.CarbonMessage carbonMessage, org.wso2.carbon.messaging.CarbonCallback carbonCallback) throws java.lang.Exception {
    fileContent = org.wso2.carbon.transport.file.test.util.TestMessageProcessor.getStringFromInputStream(carbonMessage.getInputStream());
    done();
    return false;
}