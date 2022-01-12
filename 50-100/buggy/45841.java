public void checkUpdate() {
    if (updateAvailable()) {
        plugin.getLogger().info("===================[Update Available]===================");
        plugin.getLogger().info(("You are running version " + (getCurrentVersion())));
        plugin.getLogger().info(("The latest version avaliable is " + (getUpdateVersion())));
    }else {
        plugin.getLogger().info(("You are running the latest version of " + (pluginName)));
    }
}