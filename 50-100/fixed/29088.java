public void onChildNodeInserted(java.lang.Object element, int parentNodeId, int previousNodeId, com.facebook.stetho.inspector.elements.DOMView view, com.facebook.stetho.common.Accumulator<java.lang.Object> insertedElements) {
    com.facebook.stetho.inspector.protocol.module.DOM.ChildNodeInsertedEvent insertedEvent = acquireChildNodeInsertedEvent();
    insertedEvent.parentNodeId = parentNodeId;
    insertedEvent.previousNodeId = previousNodeId;
    insertedEvent.node = createNodeForElement(element, view);
    insertedElements.store(element);
    mPeerManager.sendNotificationToPeers("DOM.childNodeInserted", insertedEvent);
    releaseChildNodeInsertedEvent(insertedEvent);
}