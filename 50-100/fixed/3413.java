protected void readFluidToByteBuf(com.nik7.upgcraft.tileentities.FluidTank tank, io.netty.buffer.ByteBuf buf) {
    int fluidAmount = buf.readInt();
    int fluidID = buf.readInt();
    if (fluidAmount > 0) {
        tank.setFluid(new com.nik7.upgcraft.tileentities.FluidStack(com.nik7.upgcraft.tileentities.FluidRegistry.getFluid(fluidID), fluidAmount));
    }else
        tank.setFluid(null);
    
    worldObj.markBlockRangeForRenderUpdate(xCoord, yCoord, zCoord, xCoord, yCoord, zCoord);
}