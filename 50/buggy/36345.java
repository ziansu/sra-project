public void removeWithEvent(int index) {
    java.lang.Object element = remove(index);
    int nodeId = mObjectIdMapper.getIdForObject(element);
    mUpdateListeners.onChildNodeRemoved(mParentNodeId, nodeId);
}