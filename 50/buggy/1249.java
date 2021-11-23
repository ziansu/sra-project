@java.lang.Override
public boolean send(org.wso2.carbon.messaging.CarbonMessage msg, org.wso2.carbon.messaging.CarbonCallback callback) throws org.wso2.carbon.messaging.exceptions.ClientConnectorException {
    return invokeSend(msg, callback);
}