@java.lang.Override
public net.minecraft.item.ItemStack onItemRightClick(net.minecraft.item.ItemStack itemStack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer entityPlayer) {
    net.minecraft.item.ItemStack activeStack = toolboxCache.getActiveStack(entityPlayer, itemStack);
    if (activeStack != null) {
        activeStack.useItemRightClick(world, entityPlayer);
        updateActiveStack(itemStack, activeStack);
    }else {
        entityPlayer.openGui(RefinedRelocation2.instance, GuiHandler.GUI_TOOLBOX, world, entityPlayer.getPosition().getX(), entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ());
    }
    return itemStack;
}