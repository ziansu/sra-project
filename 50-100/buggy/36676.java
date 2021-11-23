@java.lang.Override
public org.eclipse.smarthome.core.library.types.DecimalType getMemoryAvailablePercent() {
    long availableMemory = memory.getAvailable();
    long totalMemory = memory.getTotal();
    double freePercentDecimal = ((double) (availableMemory)) / ((double) (totalMemory));
    double freePercent = getPercentsValue(freePercentDecimal);
    return new org.eclipse.smarthome.core.library.types.DecimalType(freePercent);
}