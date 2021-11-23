void setServiceDown(final org.jboss.msc.txn.Transaction transaction) {
    setValue(null);
    org.jboss.msc.txn.ServiceControllerImpl.NotificationEntry<T> disableObservers;
    synchronized(this) {
        setState(org.jboss.msc.txn.ServiceControllerImpl.STATE_DOWN);
        transition(transaction);
        disableObservers = this.disableObservers;
        this.disableObservers = null;
    }
    while (disableObservers != null) {
        safeCallListener(disableObservers.completionListener);
        disableObservers = disableObservers.next;
    } 
    primaryRegistration.serviceDown();
    for (final org.jboss.msc.txn.Registration aliasRegistration : aliasRegistrations) {
        aliasRegistration.serviceDown();
    }
}