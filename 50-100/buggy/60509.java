protected void writeFluidToByteBuf(com.nik7.upgcraft.tileentities.FluidTank tank, io.netty.buffer.ByteBuf buf) {
    com.nik7.upgcraft.tileentities.FluidStack fluidStack = (tank != null) ? this.tank[0].getFluid() : null;
    int fluidAmount = -1;
    int fluidID = -1;
    if (fluidStack != null) {
        fluidAmount = fluidStack.amount;
        fluidID = fluidStack.getFluidID();
    }
    buf.writeInt(fluidAmount);
    buf.writeInt(fluidID);
}