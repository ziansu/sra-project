@java.lang.Override
public cyano.electricadvantage.machines.FluidStack drain(net.minecraft.util.EnumFacing face, cyano.electricadvantage.machines.FluidStack fluid, boolean forReal) {
    if (((getTank().getFluidAmount()) > 0) && (getTank().getFluid().getFluid().equals(fluid.getFluid()))) {
        return getTank().drain(fluid.amount, forReal);
    }else {
        return getTank().drain(0, false);
    }
}