public void setCorners(org.bukkit.Location corner1, org.bukkit.Location corner2) {
    org.apache.commons.lang.Validate.isTrue(corner1.getWorld().equals(corner2.getWorld()), "The two corners of an arena must be in the same world.");
    this.lowestCorner = corner1;
    this.highestCorner = corner2;
    computeSortedCorners();
    if (isRegistered())
        com.pgcraft.spectatorplus.SpectatorPlus.get().getArenasManager().save();
    
}