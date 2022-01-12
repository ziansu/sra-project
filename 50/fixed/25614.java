public com.cognifide.slice.core.internal.monitoring.ModelUsageData copy() {
    com.cognifide.slice.core.internal.monitoring.ModelUsageData copy = new com.cognifide.slice.core.internal.monitoring.ModelUsageData();
    copy.count = this.count;
    copy.totalTime = this.totalTime;
    return copy;
}