@java.lang.Override
public boolean insertStack(mcjty.rftools.craftinggrid.IItemKey key, net.minecraft.item.ItemStack stack) {
    mcjty.rftools.craftinggrid.TileEntityItemSource.ItemKey realKey = ((mcjty.rftools.craftinggrid.TileEntityItemSource.ItemKey) (key));
    return mcjty.rftools.craftinggrid.TileEntityItemSource.insertStackInSlot(realKey.getInventory(), realKey.getSlot(), stack);
}