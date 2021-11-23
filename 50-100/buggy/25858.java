void serviceRemoved() {
    if ((installedServices.decrementAndGet()) > 0)
        return ;
    
    org.jboss.msc.txn.ServiceRegistryImpl.NotificationEntry removeObservers;
    synchronized(this) {
        removeObservers = this.removeObservers;
        this.removeObservers = null;
    }
    while (removeObservers != null) {
        safeCallListener(removeObservers.completionListener);
        removeObservers = removeObservers.next;
    } 
    container.registryRemoved();
}