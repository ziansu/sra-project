public void declineCall(java.lang.String pParam) {
    com.voximplant.sdk.AVoImClient.DeclineCallClassParam param = GetJsonObj(pParam, com.voximplant.sdk.AVoImClient.DeclineCallClassParam.class);
    if ((param.headers) == null)
        client.declineCall(param.callId);
    else
        client.declineCall(param.callId, GetMapFromList(param.headers));
    
}