public void hangup(java.lang.String pCallId) {
    com.voximplant.sdk.AVoImClient.HangupClassParam param = GetJsonObj(pParam, com.voximplant.sdk.AVoImClient.HangupClassParam.class);
    if ((param.headers) == null)
        client.disconnectCall(param.callId);
    else
        client.disconnectCall(param.callId, GetMapFromList(param.headers));
    
}