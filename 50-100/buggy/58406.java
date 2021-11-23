private void initializeGlobals() {
    stateStore = new org.apache.mesos.curator.CuratorStateStore(serviceSpecification.getName(), zkConnectionString);
    taskFailureListener = new org.apache.mesos.scheduler.DefaultTaskFailureListener(stateStore);
    taskKiller = new org.apache.mesos.scheduler.DefaultTaskKiller(stateStore, taskFailureListener);
    reconciler = new org.apache.mesos.reconciliation.DefaultReconciler();
    offerAccepter = new org.apache.mesos.scheduler.OfferAccepter(java.util.Arrays.asList(new org.apache.mesos.state.PersistentOperationRecorder(stateStore)));
}