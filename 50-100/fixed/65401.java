@java.lang.Override
public boolean shouldUseRenderHelper(net.minecraftforge.client.IItemRenderer.ItemRenderType.ItemRenderType type, net.minecraft.item.ItemStack item, net.doubledoordev.itemblacklist.client.ItemRendererHelper helper) {
    net.minecraft.item.ItemStack unpacked = net.doubledoordev.itemblacklist.util.ItemBlacklisted.unpack(item);
    if (unpacked == item)
        return helper != (ItemRendererHelper.INVENTORY_BLOCK);
    
    net.minecraftforge.client.IItemRenderer renderer = net.minecraftforge.client.MinecraftForgeClient.getItemRenderer(unpacked, type);
    if (renderer != null)
        return renderer.shouldUseRenderHelper(type, unpacked, helper);
    
    return helper != (ItemRendererHelper.INVENTORY_BLOCK);
}