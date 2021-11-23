@java.lang.Override
public org.bukkit.plugin.Plugin get() {
    final org.bukkit.plugin.Plugin plugin = this.plugin.getServer().getPluginManager().getPlugin(Dependency.NUVOTIFIER.getInternalString());
    try {
        if ((plugin == null) || (!(plugin instanceof com.vexsoftware.votifier.NuVotifierBukkit))) {
            return null;
        }
    } catch (java.lang.NoClassDefFoundError e) {
        e.printStackTrace();
    }
    return plugin;
}