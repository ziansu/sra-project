@java.lang.Override
public com.trcx.ita.Common.Item.ItemStack onItemRightClick(com.trcx.ita.Common.Item.ItemStack swapper, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player) {
    if (player.isSneaking()) {
        if (!(world.isRemote))
            player.openGui(Main.instance, 0, world, 0, 0, 0);
        
    }else {
        com.trcx.ita.Common.Item.ItemStack is = com.trcx.ita.Common.Item.Swapper.getStack(com.trcx.ita.Common.Item.Swapper.slotRightClick, swapper);
        if (is != null) {
            com.trcx.ita.Common.Item.Swapper.putLastStack(swapper, is.getItem().onItemRightClick(is, world, player));
        }
    }
    return swapper;
}