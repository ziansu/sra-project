@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World worldIn, int x, int y, int z, net.minecraft.entity.player.EntityPlayer player, int side, float subX, float subY, float subZ) {
    if (!(worldIn.isRemote)) {
        player.openGui(ModUncrafting.instance, ModGuiHandler.GUI_TABLE, worldIn, x, y, z);
        checkForPorteManteau(player, worldIn, x, y, z);
    }
    return true;
}