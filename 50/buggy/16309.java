@java.lang.Override
public org.eclipse.smarthome.core.library.types.DecimalType getProcessMemoryUsage(int pid) throws org.openhab.binding.systeminfo.model.DeviceNotFoundException {
    oshi.software.os.OSProcess process = operatingSystem.getProcess(pid);
    long memortInBytes = process.getResidentSetSize();
    long memoryInMB = getSizeInMB(memortInBytes);
    return new org.eclipse.smarthome.core.library.types.DecimalType(memoryInMB);
}