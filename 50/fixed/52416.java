@java.lang.Override
public int fill(net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    int amount = tank.fill(resource, doFill);
    this.notifyBlockUpdate();
    return amount;
}