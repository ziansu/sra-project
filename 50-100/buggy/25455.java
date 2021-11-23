@java.lang.Override
public void onDestroyed(de.ellpeck.rockbottom.api.world.IWorld world, int x, int y, de.ellpeck.rockbottom.api.entity.Entity destroyer, de.ellpeck.rockbottom.api.world.TileLayer layer, boolean shouldDrop) {
    super.onDestroyed(world, x, y, destroyer, layer, shouldDrop);
    if (!(de.ellpeck.rockbottom.api.RockBottomAPI.getNet().isClient())) {
        alexanders.mods.df.tile.TileEntityDrill te = world.getTileEntity(x, y, alexanders.mods.df.tile.TileEntityDrill.class);
        if (te != null) {
            te.dropInventory(te.inventory);
            te.dropInventory(te.fuelInventory);
        }
    }
}