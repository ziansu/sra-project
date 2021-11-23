@java.lang.Override
public int fill(net.minecraft.util.EnumFacing from, net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    int used = 0;
    if ((this.getPipeInputDirection().equals(from)) && (resource != null)) {
        if (micdoodle8.mods.galacticraft.core.util.FluidUtil.testFuel(net.minecraftforge.fluids.FluidRegistry.getFluidName(resource))) {
            used = this.fuelTank.fill(resource, doFill);
        }
    }
    return used;
}