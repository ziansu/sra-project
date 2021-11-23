private void saveWhitelist(com.github.mmonkey.Destinations.Warp warp) {
    ninja.leaping.configurate.commented.CommentedConfigurationNode config = getConfig().getNode(warp.getName(), com.github.mmonkey.Destinations.Services.WarpStorageService.WHITELIST);
    for (java.util.Map.Entry<java.util.UUID, java.lang.Boolean> item : warp.getWhitelist().entrySet()) {
        config.getNode(item.getKey().toString()).setValue(item.getValue());
    }
}