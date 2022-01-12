@java.lang.Override
public double rankCloudlet(edu.cmu.sei.ams.cloudlet.Service service, edu.cmu.sei.ams.cloudlet.Cloudlet cloudlet) throws edu.cmu.sei.ams.cloudlet.CloudletException {
    edu.cmu.sei.ams.cloudlet.rank.CpuPerformanceRanker.log.entry(service, cloudlet);
    edu.cmu.sei.ams.cloudlet.CpuInfo cpuInfo = cloudlet.getSystemInfo().getCPUInfo();
    double ranking = ((100.0 * (cpuInfo.getTotalCores())) - (cpuInfo.getUsage())) * (cpuInfo.getSpeed());
    edu.cmu.sei.ams.cloudlet.rank.CpuPerformanceRanker.log.exit(ranking);
    return ranking;
}