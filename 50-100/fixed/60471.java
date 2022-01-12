@java.lang.Override
public void addCraftingToCrafters(net.minecraft.inventory.ICrafting iCrafting) {
    super.addCraftingToCrafters(iCrafting);
    iCrafting.sendProgressBarUpdate(this, 0, this.termoFluidFurnace.smeltingTicks);
    iCrafting.sendProgressBarUpdate(this, 1, this.termoFluidFurnace.totalSmeltingTicks);
    iCrafting.sendProgressBarUpdate(this, 2, ((int) (this.termoFluidFurnace.internalTemp)));
}