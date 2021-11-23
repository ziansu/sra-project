protected void setCheckpointForcingThresholds() throws java.lang.Exception {
    this.forceCheckpointOnPendingUpdateCount = this.dataStore.refreshForceCheckpointThresholds();
    this.warnUpdatesPendingCount = ((long) (java.lang.Math.ceil(((this.forceCheckpointOnPendingUpdateCount) / 2))));
    this.reportUpdatesPendingCount = ((long) (java.lang.Math.ceil(((this.warnUpdatesPendingCount) / 2))));
}