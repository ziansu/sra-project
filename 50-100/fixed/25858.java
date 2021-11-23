void serviceRemoved() {
    org.jboss.msc.txn.ServiceRegistryImpl.NotificationEntry removeObservers;
    synchronized(this) {
        if ((--(installedServices)) > 0)
            return ;
        
        removeObservers = this.removeObservers;
        this.removeObservers = null;
    }
    while (removeObservers != null) {
        safeCallListener(removeObservers.completionListener);
        removeObservers = removeObservers.next;
    } 
    container.registryRemoved();
}