private void loadPlugin() {
    com.kaltura.playkit.plugins.Youbora.YouboraPlugin.log.d("loadPlugin");
    if ((pluginConfig) != null) {
        if ((pluginConfig.has("enableSmartAds")) && (!(pluginConfig.get("enableSmartAds").isJsonNull()))) {
            adAnalytics = pluginConfig.getAsJsonPrimitive("enableSmartAds").getAsBoolean();
        }
        messageBus.listen(eventListener, PlayerEvent.Type.DURATION_CHANGE);
    }
}