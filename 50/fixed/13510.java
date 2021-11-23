public java.lang.String getPortFromPreferences(android.content.Context context) {
    if ((org.wso2.emm.agent.utils.Preference.getString(context, Constants.PORT)) != null) {
        return org.wso2.emm.agent.utils.Preference.getString(context, Constants.PORT);
    }else {
        return org.wso2.emm.agent.utils.Constants.API_SERVER_PORT;
    }
}