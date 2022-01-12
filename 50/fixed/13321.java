public void onAttributeRemoved(java.lang.Object element, java.lang.String name) {
    com.facebook.stetho.inspector.protocol.module.DOM.AttributeRemovedEvent message = new com.facebook.stetho.inspector.protocol.module.DOM.AttributeRemovedEvent();
    message.nodeId = mDocument.getIdForObject(element);
    message.name = name;
    mPeerManager.sendNotificationToPeers("DOM.attributeRemoved", message);
}