@java.lang.Override
public java.util.Collection<org.bukkit.inventory.ItemStack> getDrops(net.glowstone.block.GlowBlock block, org.bukkit.inventory.ItemStack tool) {
    java.util.Collection<org.bukkit.inventory.ItemStack> drops = null;
    for (net.glowstone.block.blocktype.BlockType feature : getFeatures()) {
        drops = throwDouble(drops, feature.getDrops(block, tool));
    }
    return drops;
}