@java.lang.Override
public net.minecraftforge.fluids.FluidStack drain(net.minecraft.util.EnumFacing from, net.minecraftforge.fluids.FluidStack resource, boolean doDrain) {
    if ((resource != null) && (canDrain(from, resource.getFluid()))) {
        return fluidTank.drain(resource.amount, ((tier) != (mekanism.common.Tier.FluidTankTier.CREATIVE)));
    }
    return null;
}