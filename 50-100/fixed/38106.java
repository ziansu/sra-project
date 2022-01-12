@java.lang.Override
public java.lang.Object getClientGuiElement(int ID, net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, int x, int y, int z) {
    net.minecraft.util.BlockPos pos = new net.minecraft.util.BlockPos(x, y, z);
    com.minecolonies.tileentities.ScarecrowTileEntity tileEntity = ((com.minecolonies.tileentities.ScarecrowTileEntity) (world.getTileEntity(pos)));
    return new com.minecolonies.inventory.GuiField(player.inventory, tileEntity.inventoryField, world, pos);
}