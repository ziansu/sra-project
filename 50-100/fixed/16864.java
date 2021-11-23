@java.lang.Override
public java.lang.Object getClientGuiElement(int ID, net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, int x, int y, int z) {
    xyz.joshstroup.mechatech.handler.GuiHandler.initGuiScreens(player, world, world.getTileEntity(new net.minecraft.util.math.BlockPos(x, y, z)));
    if (xyz.joshstroup.mechatech.handler.GuiHandler.guiScreens.containsKey(ID)) {
        return xyz.joshstroup.mechatech.handler.GuiHandler.guiScreens.get(ID);
    }
    return null;
}