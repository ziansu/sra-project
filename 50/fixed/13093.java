public void setFinalTransferTime(double finalTransferTime) {
    icpPlanner.setFinalTransferDuration(finalTransferTime);
    linearMomentumRateOfChangeControlModule.setFinalTransferDuration(finalTransferTime);
}