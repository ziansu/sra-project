@java.lang.Override
public io.crate.monitor.ExtendedOsStats osStats() {
    io.crate.monitor.ExtendedOsStats.Cpu cpuStats = new io.crate.monitor.ExtendedOsStats.Cpu(((short) (0)), ((short) (4)), ((short) (94)), ((short) (10)));
    io.crate.monitor.ExtendedOsStats osStats = new io.crate.monitor.ExtendedOsStats(cpuStats);
    osStats.uptime(3600L);
    osStats.loadAverage(new double[]{ 1 , 5 , 15 });
    return osStats;
}