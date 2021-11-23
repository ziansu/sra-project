public int getBurnTime(net.minecraft.item.ItemStack item) {
    if ((com.vanhal.progressiveautomation.PAConfig.fuelCost) == 0)
        return 0;
    
    return (com.vanhal.progressiveautomation.entities.BaseTileEntity.getItemBurnTime(item)) / (com.vanhal.progressiveautomation.PAConfig.fuelCost);
}