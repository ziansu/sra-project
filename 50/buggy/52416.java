@java.lang.Override
public int fill(net.minecraftforge.fluids.FluidStack resource, boolean doFill) {
    int amount = tank.fill(resource, doFill);
    if ((amount > 0) && doFill) {
        this.notifyBlockUpdate();
    }
    return amount;
}