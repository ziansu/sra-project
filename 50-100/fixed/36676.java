@java.lang.Override
public org.eclipse.smarthome.core.library.types.DecimalType getMemoryAvailablePercent() {
    long availableMemory = memory.getAvailable();
    long totalMemory = memory.getTotal();
    double freePercent;
    if (totalMemory > 0) {
        double freePercentDecimal = ((double) (availableMemory)) / ((double) (totalMemory));
        freePercent = getPercentsValue(freePercentDecimal);
    }else {
        freePercent = 0;
    }
    return new org.eclipse.smarthome.core.library.types.DecimalType(freePercent);
}