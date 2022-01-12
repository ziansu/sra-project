@java.lang.Override
public boolean workCycle() {
    forestry.core.fluids.FluidHelper.FillStatus status;
    if (currentRecipe.fillRecipe) {
        status = forestry.core.fluids.FluidHelper.fillContainers(tankManager, this, InventoryBottler.SLOT_RIGHT_PROCESSING, InventoryBottler.SLOT_OUTPUT_FULL_CONTAINER, currentRecipe.fluid.getFluid(), true);
    }else {
        status = forestry.core.fluids.FluidHelper.drainContainers(tankManager, this, InventoryBottler.SLOT_LEFT_PROCESSING, InventoryBottler.SLOT_OUTPUT_EMPTY_CONTAINER, true);
    }
    if (status == (forestry.core.fluids.FluidHelper.FillStatus.SUCCESS)) {
        currentRecipe = null;
        return true;
    }
    return false;
}