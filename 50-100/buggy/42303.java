@java.lang.Override
public void initializeForTransfer(double initialTime) {
    this.initialTime.set(initialTime);
    isStanding.set(false);
    isDoubleSupport.set(true);
    int numberOfFootstepRegistered = getNumberOfFootstepsRegistered();
    transferDurations.get(numberOfFootstepRegistered).set(finalTransferDuration.getDoubleValue());
    transferDurationAlphas.get(numberOfFootstepRegistered).set(finalTransferDurationAlpha.getDoubleValue());
    updateTransferPlan();
}