@com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod
public void setAttributesAsText(com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer peer, org.json.JSONObject params) {
    final com.facebook.stetho.inspector.protocol.module.DOM.SetAttributesAsTextRequest request = mObjectMapper.convertValue(params, com.facebook.stetho.inspector.protocol.module.DOM.SetAttributesAsTextRequest.class);
    final java.lang.Object object = mDocument.getObjectIdMapper().getObjectForId(request.nodeId);
    mDocument.getDOMProvider().postAndWait(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mDocument.getDOMProvider().setAttributesAsText(object, request.text);
        }
    });
}