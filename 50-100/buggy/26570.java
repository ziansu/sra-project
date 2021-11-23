public static net.minecraftforge.fluids.FluidStack extractFluid(net.minecraftforge.fluids.FluidTank tileTank, mekanism.common.tile.prefab.TileEntityContainerBlock tile, int slotID, mekanism.common.util.FluidContainerUtils.FluidChecker checker) {
    net.minecraftforge.fluids.FluidStack ret = mekanism.common.util.FluidContainerUtils.extractFluid(((tileTank.getCapacity()) - (tileTank.getFluidAmount())), tile.inventory.get(slotID), checker);
    tile.inventory.set(slotID, net.minecraftforge.fluids.FluidUtil.getFluidHandler(tile.inventory.get(slotID)).getContainer());
    return ret;
}