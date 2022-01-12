public static boolean shouldPostDeployableMappingMessage(com.ibm.devops.notification.OTCNotifier notifier, java.lang.String phase, hudson.model.Result result) {
    if (notifier != null) {
        boolean onCompleted = notifier.getOnCompleted();
        boolean traceabilityEnabled = notifier.getEnableTraceability();
        if (((onCompleted && ("COMPLETED".equals(phase))) && (result.equals(Result.SUCCESS))) && traceabilityEnabled) {
            return true;
        }
    }
    return false;
}