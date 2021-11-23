private boolean setupWorldEdit() {
    org.bukkit.plugin.Plugin test = this.getServer().getPluginManager().getPlugin("WorldEdit");
    if ((svenbrnn.orerespawn.oreRespawn.worldEdit) == null) {
        if (test != null) {
            svenbrnn.orerespawn.oreRespawn.worldEdit = ((com.sk89q.worldedit.bukkit.WorldEditPlugin) (test));
            java.lang.System.out.println("[OreRespawn] WorldEdit detected!");
            return true;
        }
    }
    return false;
}