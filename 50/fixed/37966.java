public final void traverse() {
    if ((!(traversalRequired)) && (!(cache.hasDirtyPojos()))) {
        return ;
    }
    traverseCache();
    traverseWorkList();
    traversalRequired = false;
}