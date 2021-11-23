@uk.co.bluegecko.core.aspect.profile.Profiled
@java.lang.Override
public uk.co.bluegecko.core.server.model.Health getSystemHealth() {
    final uk.co.bluegecko.core.server.model.Health health = new uk.co.bluegecko.core.server.model.Health("Jersey: Up and Running!");
    health.setOperatingSystem(getOperatingSystemDetails());
    health.setHeapMemory(memoryMXBean.getHeapMemoryUsage());
    health.setNonHeapMemory(memoryMXBean.getNonHeapMemoryUsage());
    return health;
}