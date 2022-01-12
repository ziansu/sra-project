@com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod
public void setInspectModeEnabled(com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer peer, org.json.JSONObject params) {
    final com.facebook.stetho.inspector.protocol.module.DOM.SetInspectModeEnabledRequest request = mObjectMapper.convertValue(params, com.facebook.stetho.inspector.protocol.module.DOM.SetInspectModeEnabledRequest.class);
    mDocument.getDOMProvider().postAndWait(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mDocument.getDOMProvider().setInspectModeEnabled(request.enabled);
        }
    });
}