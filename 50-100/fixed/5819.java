@java.lang.Override
public org.eclipse.smarthome.core.library.types.DecimalType getSwapAvailablePercent() {
    long usedSwap = memory.getSwapUsed();
    long totalSwap = memory.getSwapTotal();
    long freeSwap = totalSwap - usedSwap;
    double freePercent;
    if (totalSwap > 0) {
        double freePercentDecimal = ((double) (freeSwap)) / ((double) (totalSwap));
        freePercent = getPercentsValue(freePercentDecimal);
    }else {
        freePercent = 0;
    }
    return new org.eclipse.smarthome.core.library.types.DecimalType(freePercent);
}