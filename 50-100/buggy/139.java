@java.lang.Override
public boolean canTakeStack(net.minecraft.entity.player.EntityPlayer playerIn) {
    net.minecraftforge.items.IItemHandler handler = getItemHandler();
    return handler instanceof tamaized.tammodized.common.tileentity.TamTileEntityInventory.ItemStackFilterHandler ? !(((tamaized.tammodized.common.tileentity.TamTileEntityInventory.ItemStackFilterHandler) (handler)).extractBypass(i, 1, true).isEmpty()) : !(handler.extractItem(i, 1, true).isEmpty());
}