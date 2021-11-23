@java.lang.Override
public void tick(org.bukkit.block.Block block, me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem slimefunItem, me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config config) {
    updateBarrel(block);
    if (Barrels.displayItem) {
        allowDisplayItem = (block.getRelative(BlockFace.UP).getType()) == (org.bukkit.Material.AIR);
        me.john000708.barrels.DisplayItem.updateDisplayItem(block, getCapacity(block), allowDisplayItem);
    }
}