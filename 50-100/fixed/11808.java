@java.lang.Override
public void writeToPacket(io.netty.buffer.ByteBuf buf) {
    net.minecraftforge.fluids.FluidStack fluidStack = ((this.tank[0]) != null) ? this.tank[0].getFluid() : null;
    int fluidAmount = -1;
    int fluidID = -1;
    if (fluidStack != null) {
        fluidAmount = fluidStack.amount;
        fluidID = fluidStack.getFluidID();
    }
    buf.writeInt(fluidAmount);
    buf.writeInt(fluidID);
    buf.writeBoolean(isActive);
}