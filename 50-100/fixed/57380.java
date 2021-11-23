private boolean isAllowedNow(final java.util.Date startTime, final java.util.Date endTime, final boolean requiresNonInteractive, final boolean lightsOutsidePeriod) {
    final boolean timeResult = (isInPeriod(startTime, endTime)) || lightsOutsidePeriod;
    final boolean rNIResult = (!requiresNonInteractive) || (!(pm.isInteractive()));
    return timeResult && rNIResult;
}