@java.lang.Override
public org.eclipse.smarthome.core.library.types.DecimalType getSwapAvailablePercent() {
    long usedSwap = memory.getSwapUsed();
    long totalSwap = memory.getSwapTotal();
    long freeSwap = totalSwap - usedSwap;
    double freePercentDecimal = ((double) (freeSwap)) / ((double) (totalSwap));
    double freePercent = getPercentsValue(freePercentDecimal);
    return new org.eclipse.smarthome.core.library.types.DecimalType(freePercent);
}