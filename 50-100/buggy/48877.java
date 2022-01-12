@java.lang.Override
public void onBlockPlacedBy(net.minecraft.world.World world, int x, int y, int z, net.minecraft.entity.EntityLivingBase entityLiving, net.minecraft.item.ItemStack is) {
    if (!(world.isRemote)) {
        java.lang.System.out.println("Block placed.");
        steamcraft.common.tiles.energy.TileCopperWire tile = ((steamcraft.common.tiles.energy.TileCopperWire) (world.getTileEntity(x, y, z)));
        if (tile != null) {
            tile.network = null;
            tile.updateConnections();
        }
    }
}