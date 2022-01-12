public static pneumaticCraft.common.semiblock.SemiBlockLogistics getLogistics(net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack itemRequester) {
    if ((itemRequester != null) && ((itemRequester.getItem()) instanceof pneumaticCraft.common.item.ItemLogisticsFrame)) {
        pneumaticCraft.common.semiblock.SemiBlockLogistics logistics = ((pneumaticCraft.common.semiblock.SemiBlockLogistics) (pneumaticCraft.common.semiblock.SemiBlockManager.getSemiBlockForKey(((pneumaticCraft.common.item.ItemLogisticsFrame) (itemRequester.getItem())).semiBlockId)));
        logistics.initialize(player.worldObj, new net.minecraft.world.ChunkPosition(0, 0, 0));
        logistics.onPlaced(player, itemRequester);
        return logistics;
    }else {
        return null;
    }
}