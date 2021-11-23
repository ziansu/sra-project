protected java.util.List<java.lang.String> validateNoIntersectingInterval(com.jraska.vsb.or1.data.Output output) {
    java.util.List<com.jraska.vsb.or1.schedule.validation.NoWaitFlowShopValidator.IntervalWrapper>[] machineIntervals = getIntervalsForMachines(output);
    java.util.List<java.lang.String> validationErrors = new java.util.ArrayList<java.lang.String>();
    for (int machineIndex = 0, count = output.getMachinesCount(); machineIndex < count; machineIndex++) {
        java.util.List<com.jraska.vsb.or1.schedule.validation.NoWaitFlowShopValidator.IntervalWrapper> intervals = machineIntervals[machineIndex];
        validationErrors.addAll(checkForIntersectionErrors(intervals));
    }
    return validationErrors;
}