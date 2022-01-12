protected void run(java.lang.String[] args) {
    this.options = newOptions(args);
    try {
        java.lang.String result = remote.execute(newOperation());
        java.lang.System.out.println((result == null ? "success" : result));
    } catch (java.lang.Exception e) {
        throw new com.hazelcast.simulator.utils.CommandLineExitException(java.lang.String.format("Could not process command %s: message [%s]", name(), e.getMessage()));
    }
}