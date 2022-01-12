public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.hazelcast.simulator.coordinator.CoordinatorRemoteCli cli = null;
    try {
        cli = new com.hazelcast.simulator.coordinator.CoordinatorRemoteCli(args);
        cli.run();
    } catch (java.lang.Exception e) {
        java.lang.System.err.print(e.getMessage());
        com.hazelcast.simulator.utils.CommonUtils.exitWithError(com.hazelcast.simulator.coordinator.CoordinatorRemoteCli.LOGGER, e.getMessage(), e);
    } finally {
        com.hazelcast.simulator.utils.CommonUtils.closeQuietly(cli);
    }
}