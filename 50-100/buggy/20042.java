public void onAttributeModified(java.lang.Object element, java.lang.String name, java.lang.String value) {
    com.facebook.stetho.inspector.protocol.module.DOM.AttributeModifiedEvent message = new com.facebook.stetho.inspector.protocol.module.DOM.AttributeModifiedEvent();
    message.nodeId = mDocument.getObjectIdMapper().getIdForObject(element);
    message.name = name;
    message.value = value;
    mPeerManager.sendNotificationToPeers("DOM.onAttributeModified", message);
}