@java.lang.Override
public org.eclipse.smarthome.core.library.types.DecimalType getProcessCpuUsage(int pid) throws org.openhab.binding.systeminfo.model.DeviceNotFoundException {
    oshi.software.os.OSProcess process = getProcess(pid);
    double cpuUsageRaw = ((process.getKernelTime()) + (process.getUserTime())) / (process.getUpTime());
    java.math.BigDecimal cpuUsage = getPercentsValue(cpuUsageRaw);
    return new org.eclipse.smarthome.core.library.types.DecimalType(cpuUsage);
}