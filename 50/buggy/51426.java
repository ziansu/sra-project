public void disconnectCall(java.lang.String p) {
    com.voximplant.sdk.AVoImClient.DisconnectCallClassParam param = GetJsonObj(pParam, com.voximplant.sdk.AVoImClient.DisconnectCallClassParam.class);
    if ((param.headers) == null)
        client.disconnectCall(param.callId);
    else
        client.disconnectCall(param.callId, GetMapFromList(param.headers));
    
}