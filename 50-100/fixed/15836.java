@java.lang.Override
protected java.lang.String getReason() {
    java.lang.StringBuilder reason = new java.lang.StringBuilder("\n");
    if (!(inputIsPresent())) {
        reason.append("- input is missing, connect to a system first\n");
    }
    if (!(featureGeneratorIsReady())) {
        reason.append("- feature generator not ready\n");
    }
    if (!(modelIsReady())) {
        reason.append("- model is not ready\n");
    }
    if (!(anomalyDetectorIsReady())) {
        reason.append("- anomaly detector is not ready\n");
    }
    return reason.toString();
}