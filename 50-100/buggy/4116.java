@java.lang.Override
public boolean handleRenderType(net.minecraft.item.ItemStack item, net.minecraftforge.client.IItemRenderer.ItemRenderType.ItemRenderType type) {
    if (!(net.doubledoordev.itemblacklist.util.ItemBlacklisted.canUnpack(item)))
        return false;
    
    net.minecraft.item.ItemStack unpacked = net.doubledoordev.itemblacklist.util.ItemBlacklisted.unpack(item);
    net.minecraftforge.client.IItemRenderer renderer = net.minecraftforge.client.MinecraftForgeClient.getItemRenderer(unpacked, type);
    if (renderer != null)
        return renderer.handleRenderType(unpacked, type);
    
    return (unpacked.getItem().getSpriteNumber()) != (ItemBlacklisted.I.getSpriteNumber());
}