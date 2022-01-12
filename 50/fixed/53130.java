@com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod
public void hideHighlight(com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer peer, org.json.JSONObject params) {
    mDocument.postAndWait(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mDocument.hideHighlight();
        }
    });
}