@java.lang.Override
public void run() {
    java.lang.String ip = agentData.getPublicAddress();
    echoLocal("Stopping Agent %s", ip);
    bash.ssh(ip, java.lang.String.format("hazelcast-simulator-%s/bin/.kill-from-pid-file agent.pid", com.hazelcast.simulator.coordinator.Coordinator.SIMULATOR_VERSION));
    if ((startHarakiriMonitorCommand) != null) {
        com.hazelcast.simulator.coordinator.Coordinator.LOGGER.info(java.lang.String.format("Starting HarakiriMonitor on %s", ip));
        bash.ssh(ip, startHarakiriMonitorCommand);
    }
}