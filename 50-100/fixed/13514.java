@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack in) {
    if (!(net.doubledoordev.itemblacklist.util.ItemBlacklisted.canUnpack(in)))
        return "_ERROR_";
    
    net.minecraft.item.ItemStack unpack = net.doubledoordev.itemblacklist.util.ItemBlacklisted.unpack(in);
    if ((unpack == in) || (unpack == null))
        return "_ERROR_";
    
    return unpack.getUnlocalizedName();
}