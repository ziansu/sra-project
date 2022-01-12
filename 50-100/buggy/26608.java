@com.facebook.react.bridge.ReactMethod
public void sendAuthRequest(java.lang.String scope, java.lang.String state, com.facebook.react.bridge.Callback resolve) {
    if ((api) == null) {
        callback.invoke(com.theweflex.react.WeChatModule.NOT_REGISTERED);
        return ;
    }
    com.tencent.mm.sdk.modelmsg.SendAuth.Req req = new com.tencent.mm.sdk.modelmsg.SendAuth.Req();
    req.scope = scope;
    req.state = state;
    resolve.invoke((api.sendReq(req) ? null : com.theweflex.react.WeChatModule.INVOKE_FAILED));
}