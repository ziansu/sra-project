@java.lang.Override
public int fill(net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    int amount = super.fill(resource, doFill);
    locked += amount;
    return amount;
}