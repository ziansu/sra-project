private boolean cleanupWorkItemReferences(org.yawlfoundation.yawl.engine.interfce.WorkItemRecord wir) {
    if (_serviceEnabled) {
        if (!(removeFromAll(wir)))
            return false;
        
        org.yawlfoundation.yawl.resourcing.ResourceMap rMap = getResourceMap(wir);
        if (rMap != null) {
            rMap.removeIgnoreList(wir);
            if (wir.getStatus().equals(WorkItemRecord.statusExecuting)) {
                freeSecondaryResources(wir);
            }
        }
        _cache.cancelCodeletRunner(wir.getID());
    }
    return true;
}