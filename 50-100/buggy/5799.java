@java.lang.Override
public net.minecraftforge.fluids.FluidStack drain(net.minecraftforge.common.util.ForgeDirection from, net.minecraftforge.fluids.FluidStack resource, boolean doDrain) {
    if (!(formed))
        return null;
    
    if ((master()) != null)
        return master().drain(from, resource, doDrain);
    
    if (resource != null) {
        net.minecraftforge.fluids.FluidStack fs = drain(from, resource.amount, doDrain);
        markDirty();
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        return fs;
    }
    return null;
}