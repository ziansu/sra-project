protected org.winterblade.minecraft.harmony.api.BaseMatchResult matches(net.minecraft.tileentity.TileEntity tileEntity, net.minecraft.item.ItemStack drop, int min, int max, boolean partial) {
    if (!(net.minecraft.inventory.IInventory.class.isAssignableFrom(tileEntity.getClass())))
        return org.winterblade.minecraft.harmony.api.BaseMatchResult.False;
    
    return matches(((net.minecraft.inventory.IInventory) (tileEntity)), drop, min, max, partial);
}