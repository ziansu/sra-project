@java.lang.Override
public void runImpl() {
    try {
        if (((this.reconfiguration_coordinator) != null) && (this.reconfiguration_coordinator.reconfigurationInProgress.get())) {
            for (edu.brown.hstore.PartitionExecutor e : this.executors) {
                if (e != null)
                    edu.brown.hstore.HStoreSite.LOG.info(e.getReconfigDebug());
                
            }
        }
    } catch (java.lang.Throwable ex) {
        ex.printStackTrace();
    }
}