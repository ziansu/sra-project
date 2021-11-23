public void onChildNodeRemoved(java.lang.Object element) {
    com.facebook.stetho.inspector.protocol.module.DOM.ChildNodeRemovedEvent removedEvent = acquireChildNodeRemovedEvent();
    com.facebook.stetho.inspector.elements.ElementInfo oldElementInfo = mDocument.getElementInfo(element);
    removedEvent.parentNodeId = mDocument.getIdForObject(oldElementInfo.parentElement);
    removedEvent.nodeId = mDocument.getIdForObject(element);
    mPeerManager.sendNotificationToPeers("DOM.childNodeRemoved", removedEvent);
    releaseChildNodeRemovedEvent(removedEvent);
}