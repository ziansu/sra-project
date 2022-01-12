@java.lang.Override
public org.eclipse.smarthome.core.library.types.StringType getProcessName(int pid) throws org.openhab.binding.systeminfo.model.DeviceNotFoundException {
    oshi.software.os.OSProcess process = getProcess(pid);
    java.lang.String name = process.getName();
    return new org.eclipse.smarthome.core.library.types.StringType(name);
}