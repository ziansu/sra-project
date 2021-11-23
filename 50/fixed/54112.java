@java.lang.Override
public void activityStarted(net.whistlingfish.harmony.config.Activity activity) {
    org.openhab.binding.harmonyhub.internal.HarmonyHubBinding.logger.debug("activityStarted called for {}", config.getQualifier());
    updateActivity(activity, config.getQualifier());
}