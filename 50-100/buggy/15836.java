@java.lang.Override
protected java.lang.String getReason() {
    java.lang.String reason = "\n";
    if (!(inputIsPresent()))
        reason += "- input is missing, connect to a system first\n";
    
    if (!(featureGeneratorIsReady()))
        reason += "- feature generator not ready\n";
    
    if (!(modelIsReady()))
        reason += "- model is not ready\n";
    
    if (!(anomalyDetectorIsReady()))
        reason += "- anomaly detector is not ready\n";
    
    return reason;
}