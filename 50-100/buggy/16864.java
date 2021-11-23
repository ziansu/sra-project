@java.lang.Override
public java.lang.Object getClientGuiElement(int ID, net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, int x, int y, int z) {
    try {
        xyz.joshstroup.mechatech.handler.GuiHandler.initGuiScreens(player, world, world.getTileEntity(new net.minecraft.util.math.BlockPos(x, y, z)));
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println("FAILED TO GET TILEENTITY FOR GUI. THIS IS MOST LIKELY THE FAULT OF THE MOD AUTHORS, PLEASE REPORT YOUR CRASH LOG. ABORTING...");
        java.lang.System.out.println(e.toString());
        java.lang.System.exit(1);
    }
    if (xyz.joshstroup.mechatech.handler.GuiHandler.guiScreens.containsKey(ID)) {
        return xyz.joshstroup.mechatech.handler.GuiHandler.guiScreens.get(ID);
    }
    return null;
}