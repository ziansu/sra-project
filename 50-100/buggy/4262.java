public boolean addWarp(java.util.UUID player, org.bukkit.Location loc) {
    final java.lang.String locS = com.wasteofplastic.askyblock.util.Util.getStringLocation(loc);
    if (warpList.containsValue(locS)) {
        return false;
    }
    if (warpList.containsKey(player)) {
        warpList.remove(player);
    }
    warpList.put(player, locS);
    saveWarpList();
    return true;
}