public void removeWithEvent(int index) {
    java.lang.Object element = remove(index);
    java.lang.Integer nodeId = mObjectIdMapper.getIdForObject(element);
    if (nodeId != null) {
        mUpdateListeners.onChildNodeRemoved(mParentNodeId, nodeId);
    }
}