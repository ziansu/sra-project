private org.wso2.carbon.messaging.CarbonMessage createCarbonMsg(org.ballerinalang.bre.Context context) {
    org.ballerinalang.model.values.BConnector bConnector = ((org.ballerinalang.model.values.BConnector) (getRefArgument(context, 0)));
    java.lang.String path = getStringArgument(context, 0);
    org.ballerinalang.model.values.BMessage bMessage = ((org.ballerinalang.model.values.BMessage) (getArgument(context, 1)));
    org.wso2.carbon.messaging.CarbonMessage cMsg = bMessage.value();
    prepareRequest(bConnector, path, cMsg);
    cMsg.setProperty(Constants.HTTP_METHOD, Constants.HTTP_METHOD_POST);
    return cMsg;
}