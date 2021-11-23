@java.lang.Override
public void insertStack(mcjty.rftools.craftinggrid.IItemKey key, net.minecraft.item.ItemStack stack) {
    mcjty.rftools.craftinggrid.TileEntityItemSource.ItemKey realKey = ((mcjty.rftools.craftinggrid.TileEntityItemSource.ItemKey) (key));
    mcjty.rftools.craftinggrid.TileEntityItemSource.insertStackInSlot(realKey.getInventory(), realKey.getSlot(), stack);
}