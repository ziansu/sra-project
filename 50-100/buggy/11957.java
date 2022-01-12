public synchronized void start() {
    assert (this.state) == (ShutdownState.INITIALIZED) : "Invalid MessengerState " + (this.state);
    this.state = ShutdownState.STARTED;
    if (edu.brown.hstore.ReconfigCoordinator.debug.val)
        edu.brown.hstore.ReconfigCoordinator.LOG.debug("Initializing connections");
    
    this.initConnections();
    if (edu.brown.hstore.ReconfigCoordinator.debug.val)
        edu.brown.hstore.ReconfigCoordinator.LOG.debug("Starting listener thread");
    
    this.listener_thread.start();
    if ((this.local_site_id) == 0) {
        this.initCluster();
    }
    this.ready_observable.notifyObservers(this);
}