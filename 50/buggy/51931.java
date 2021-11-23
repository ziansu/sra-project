public int getBurnTime(net.minecraft.item.ItemStack item) {
    return (com.vanhal.progressiveautomation.entities.BaseTileEntity.getItemBurnTime(item)) / (com.vanhal.progressiveautomation.PAConfig.fuelCost);
}