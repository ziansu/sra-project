@java.lang.Override
public void onEnable() {
    b = true;
    getCommand("gethead").setExecutor(new fr.weefle.headgetter.CommandHead(this));
    getServer().getPluginManager().registerEvents(new fr.weefle.headgetter.HeadListener(this), this);
    try {
        new fr.weefle.headgetter.Updater(this, 42527);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    super.onEnable();
}