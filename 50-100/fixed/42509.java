@java.lang.Override
public net.minecraft.item.ItemStack onItemRightClick(net.minecraft.item.ItemStack stack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer entityplayer) {
    cpw.mods.fml.common.network.internal.FMLNetworkHandler.openGui(entityplayer, AMCore.instance, ArsMagicaGuiIdList.GUI_ESSENCE_BAG, world, ((int) (entityplayer.posX)), ((int) (entityplayer.posY)), ((int) (entityplayer.posZ)));
    return stack;
}