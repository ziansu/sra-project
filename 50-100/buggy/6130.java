@java.lang.Override
public void addTo(net.whistlingfish.harmony.HarmonyClient client) {
    client.addListener(new net.whistlingfish.harmony.ActivityChangeListener() {
        @java.lang.Override
        public void activityStarted(net.whistlingfish.harmony.config.Activity activity) {
            org.openhab.binding.harmonyhub.internal.HarmonyHubBinding.logger.debug("activityStarted called for {}", config.getQualifier());
            updateActivity(activity);
        }
    });
    updateActivity(client.getCurrentActivity());
}