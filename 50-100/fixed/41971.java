public static boolean shouldPostDeployableMappingMessage(com.ibm.devops.notification.OTCNotifier notifier, java.lang.String phase, hudson.model.Result result) {
    if ((notifier != null) && (notifier.getEnableTraceability())) {
        if ((phase == "COMPLETED") && (result.equals(Result.SUCCESS))) {
            return true;
        }
    }
    return false;
}