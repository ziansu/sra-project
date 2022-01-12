public void onInspectRequested(java.lang.Object element) {
    java.lang.Integer nodeId = mDocument.getIdForObject(element);
    if (nodeId == null) {
        com.facebook.stetho.common.LogUtil.d("DOMProvider.Listener.onInspectRequested() called for a non-mapped node: element=%s", element);
    }else {
        com.facebook.stetho.inspector.protocol.module.DOM.InspectNodeRequestedEvent message = new com.facebook.stetho.inspector.protocol.module.DOM.InspectNodeRequestedEvent();
        message.nodeId = nodeId;
        mPeerManager.sendNotificationToPeers("DOM.inspectNodeRequested", message);
    }
}