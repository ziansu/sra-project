@java.lang.Override
public net.minecraftforge.fluids.FluidStack drain(net.minecraftforge.common.util.ForgeDirection from, net.minecraftforge.fluids.FluidStack resource, boolean doDrain) {
    if (!(formed))
        return null;
    
    if ((master()) != null)
        return master().drain(from, resource, doDrain);
    
    if (resource != null) {
        return drain(from, resource.amount, doDrain);
    }
    return null;
}