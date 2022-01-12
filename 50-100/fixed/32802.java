@java.lang.Override
public boolean eval(org.ovirt.engine.core.common.businessentities.VDS p) {
    return ((((p.getUsageCpuPercent()) + (calcSpmCpuConsumption(p))) < lowUtilization) && ((p.getVmCount()) >= minVmCount)) && (((p.getCpuOverCommitTimestamp()) == null) || (((getTime().getTime()) - (p.getCpuOverCommitTimestamp().getTime())) >= (java.util.concurrent.TimeUnit.MINUTES.toMillis(cpuOverCommitDurationMinutes))));
}