void setServiceFailed(final org.jboss.msc.txn.Transaction transaction) {
    MSCLogger.FAIL.startFailed(getServiceName());
    org.jboss.msc.txn.ServiceControllerImpl.NotificationEntry<T> enableObservers;
    synchronized(this) {
        setState(org.jboss.msc.txn.ServiceControllerImpl.STATE_FAILED);
        transition(transaction);
        enableObservers = this.enableObservers;
        this.enableObservers = null;
    }
    while (enableObservers != null) {
        safeCallListener(enableObservers.completionListener);
        enableObservers = enableObservers.next;
    } 
    primaryRegistration.serviceUp();
    for (final org.jboss.msc.txn.Registration aliasRegistration : aliasRegistrations) {
        aliasRegistration.serviceUp();
    }
}