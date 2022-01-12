private void loadPlugin() {
    com.kaltura.playkit.plugins.Youbora.YouboraPlugin.log.d("loadPlugin");
    if ((pluginConfig) != null) {
        if ((pluginConfig.has("enableSmartAds")) && (!(pluginConfig.getAsJsonPrimitive("enableSmartAds").isJsonNull()))) {
            adAnalytics = pluginConfig.getAsJsonPrimitive("enableSmartAds").getAsBoolean();
        }
        messageBus.listen(eventListener, PlayerEvent.Type.DURATION_CHANGE);
    }
}