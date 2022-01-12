private boolean insideRegion(org.bukkit.entity.Player player, com.sk89q.worldguard.protection.regions.ProtectedRegion region) {
    com.sk89q.worldguard.LocalPlayer lp = com.applenick.RegionFX.RegionFX.getWorldGuard().wrapPlayer(player);
    return region.contains(lp.getPosition());
}