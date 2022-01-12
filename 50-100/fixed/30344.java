@java.lang.Override
public int fill(net.minecraft.util.EnumFacing from, net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    int amt = tank.fill(resource, doFill);
    if (doFill) {
        if (this.hasMaster()) {
            getMasterBlock().updateInternalTemps(resource.getFluid().getTemperature());
        }
    }
    return amt;
}