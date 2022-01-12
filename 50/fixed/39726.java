@java.lang.Override
public org.eclipse.smarthome.core.library.types.DecimalType getProcessThreads(int pid) throws org.openhab.binding.systeminfo.model.DeviceNotFoundException {
    oshi.software.os.OSProcess process = getProcess(pid);
    int threadCount = process.getThreadCount();
    return new org.eclipse.smarthome.core.library.types.DecimalType(threadCount);
}