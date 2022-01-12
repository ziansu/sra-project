public java.lang.String getAPIServerURL(android.content.Context context) {
    if ((org.wso2.iot.agent.utils.Constants.DEFAULT_HOST) != null) {
        APIServerURL = org.wso2.iot.agent.utils.Constants.DEFAULT_HOST;
    }else {
        APIServerURL = (((getProtocolFromPreferences(context)) + (getHostFromPreferences(context))) + (org.wso2.iot.agent.beans.ServerConfig.COLON)) + (getPortFromPreferences(context));
    }
    return APIServerURL;
}