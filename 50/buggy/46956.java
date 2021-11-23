public void clearICPPlan() {
    icpPlanner.clearPlan();
    icpPlanner.clearFinalTransferTime();
    linearMomentumRateOfChangeControlModule.clearPlan();
}