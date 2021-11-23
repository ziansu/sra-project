@java.lang.Override
public boolean onToolRightClick(net.glowstone.entity.GlowPlayer player, org.bukkit.inventory.ItemStack holding, net.glowstone.block.GlowBlock target, org.bukkit.block.BlockFace face, org.bukkit.util.Vector clickedLoc) {
    switch (target.getType()) {
        case TNT :
            fireTnt(target);
            return true;
        case OBSIDIAN :
            return fireNetherPortal(player, holding, target, face, clickedLoc);
        default :
            return setBlockOnFire(player, target, face, holding, clickedLoc);
    }
}