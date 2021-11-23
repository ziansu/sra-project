public void reset() {
    org.bukkit.World w = plugin.getServer().getWorld("Time");
    com.sk89q.worldguard.protection.managers.RegionManager mgr = plugin.worldGuard.getRegionManager(w);
    com.sk89q.worldguard.protection.regions.ProtectedRegion pr = mgr.getRegion(getName());
    if (pr != null) {
        com.tengel.time.WorldGuardUtil wgu = new com.tengel.time.WorldGuardUtil(plugin, w);
        wgu.pasteSchematic(pr, getName(), "homes");
    }else
        plugin.sendConsole((("Failed to reset home '" + (getName())) + "'"));
    
}