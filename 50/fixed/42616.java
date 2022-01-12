public void broadcast(java.lang.String name, java.lang.Object value) {
    for (com.intel.distml.platform.ActorRef worker : workers) {
        if (worker != null) {
            worker.tell(new com.intel.distml.platform.MonitorActor.VariableChange(name, value), getSelf());
        }
    }
}