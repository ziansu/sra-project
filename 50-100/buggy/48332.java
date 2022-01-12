private void restorePlotSchematic(org.bukkit.entity.Player p, com.sk89q.worldguard.protection.regions.ProtectedRegion pr) {
    org.bukkit.World w = p.getWorld();
    com.tengel.time.WorldGuardUtil wgu = new com.tengel.time.WorldGuardUtil(plugin, w);
    wgu.pasteSchematic(pr, pr.getId(), (("cplots" + (java.io.File.separator)) + (w.getName())));
}