public static int getItemBurnTime(net.minecraft.item.ItemStack item) {
    if (com.vanhal.progressiveautomation.PAConfig.allowPotatos) {
        if ((item.getItem()) == (net.minecraft.init.Items.POTATO))
            return 40;
        else
            if ((item.getItem()) == (net.minecraft.init.Items.BAKED_POTATO))
                return 80;
            
        
    }
    if (item == null)
        return 0;
    
    return net.minecraft.tileentity.TileEntityFurnace.getItemBurnTime(item);
}